package com.atguigu.sparsearray;

import myutil.MyArrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author guokun
 * @create 2019-06-11-20:08
 */
public class SparseArray {
    public static void main(String[] args) {
        //创建原始二维数组(0 -> 无 1->黑 2->白)
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        //输出
        System.out.println("原始二维数组");

        MyArrays.twoDArraySout1(chessArr1);
        int[][] sparseArr = chessArrToSpareArr(chessArr1);

        //输出
        MyArrays.twoDArraySout1(sparseArr);

        //恢复
        int[][] chessArr2 = sparseArrToChessArr(sparseArr);
        MyArrays.twoDArraySout1(chessArr2);

        String url = "temp/aaa.data";
        write(sparseArr,url);

        int[][] read = read(url);
        MyArrays.twoDArraySout1(read);

    }

    public static void write(int[][] array, String url) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(url);
            for (int[] row : array) {
                for (int data : row) {
                    fileOutputStream.write(data);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int[][] read(String url) {
        int[][] array = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(url);
            int row = fileInputStream.read();
            int clo = fileInputStream.read();
            int sum = fileInputStream.read();
            array = new int[sum+1][3];
            array[0][0] = row;
            array[0][1] = clo;
            for (int i = 1; i < sum + 1; i++) {
                array[i][0] = fileInputStream.read();
                array[i][1] = fileInputStream.read();
                array[i][2] = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    public static int[][] sparseArrToChessArr(int[][] sparseArr) {
        int[][] chessArr2 = new int[sparseArr[0][1]][sparseArr[0][1]];
        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        return chessArr2;
    }

    public static int[][] chessArrToSpareArr(int[][] chessArr1) {
        //1.先遍历得到非0个数
        int sum=0;
        for (int[] row : chessArr1) {
            for (int data : row) {
                if (data != 0)
                    sum++;
            }
        }
        //2.创建稀疏数组
        int[][] sparseArr = new int[sum+1][3];
        //3.赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        int count=0;//记录第几个非0数据
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }
        return sparseArr;
    }
}
