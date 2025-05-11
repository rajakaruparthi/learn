package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class RowColumnEqual2352 {

    public static int equalPairs(int[][] grid) {

        List<String> rows = new ArrayList<>();
        List<String> columns = new ArrayList<>();
        int count = 0;
        int colCount = 0;

        StringBuilder row = new StringBuilder();
        StringBuilder column = new StringBuilder();

        for (int i = 0; i < grid.length; i++) {
            row = new StringBuilder();
            column = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                row.append(grid[i][j]);
                column.append(grid[j][i]);
            }
            rows.add(row.toString());
            columns.add(column.toString());
        }

        System.out.println(rows);
        System.out.println(columns);

        for (String s : rows) {
            if (columns.contains(s)) {
                count++;
            }
        }

        for (String s : columns) {
            if (rows.contains(s)) {
                colCount++;
            }
        }
        return Math.max(count, colCount);
    }


    public static void main(String[] args) {

        System.out.println(equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 4}, {2, 4, 2, 2}, {2, 5, 2, 2}}));
    }
}
