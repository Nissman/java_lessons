package Java_Core.lesson_5;

import java.io.*;

public class Start {
    public static void main(String[] args) {
        AppData readIn = new AppData();
        String line = null;
        int n = getLineCount(line);
        if (n != 0) {
            //Чтение
            try (BufferedReader reader = new BufferedReader(new FileReader("in.csv"))) {
                headersRead(reader, readIn, line, n);
                dataRead(reader, readIn, line);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(readIn);
            //Запись
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("out.csv"))) {
                doWriter(writer, readIn);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void doWriter(BufferedWriter writer, AppData readIn) throws IOException {
        for (String value : readIn.getHeaders()) {
            writer.write(value + ";");
        }
        writer.write("\n");
        for (int i = 0; i < readIn.getData().length; i++) {
            for (int j = 0; j < readIn.getHeaders().length; j++) {
                writer.write(readIn.getData(i, j) + ";");
            }
            writer.write("\n");
        }
    }

    public static int getLineCount(String line) {
        try (LineNumberReader lnr = new LineNumberReader(new BufferedReader(new FileReader("in.csv")))) {
            while ((line = lnr.readLine()) != null) ;
            return lnr.getLineNumber();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    static void headersRead(BufferedReader reader, AppData readIn, String line, int n) throws IOException {
        if ((line = reader.readLine()) != null) {
            String[] token = line.split(";");
            readIn.createHeaders(token.length);
            readIn.createData(n, token.length);
            readIn.setHeaders(token);
        }
    }

    static void dataRead(BufferedReader reader, AppData readIn, String line) throws IOException {
        int i = 0;
        while ((line = reader.readLine()) != null) {
            String[] token = line.split(";");
            readIn.setData(token, i);
            i++;
        }
    }
}
