package Java_Core.lesson_5;

import java.util.Arrays;

public class AppData {
    private String[] headers;
    private int[][] data;

    public void createHeaders(int n) {
        headers = new String[n];
    }

    public void createData(int m, int n) {
        data = new int[m - 1][n];
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public void setData(String[] data, int i) {
        for (int j = 0; j < data.length; j++) {
            try {
                this.data[i][j] = Integer.parseInt(data[j]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public String[] getHeaders() {
        return headers;
    }

    public int[][] getData() {
        return data;
    }

    public int getData(int i, int j) {
        return data[i][j];
    }

    @Override
    public String toString() {
        return "AppData{" +
                "headers=" + Arrays.toString(headers) +
                "\ndata=" + Arrays.deepToString(data) +
                '}';
    }
}
