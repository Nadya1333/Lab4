package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Lab4 {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int array[], arraySize;  // Объявление
            int[] arr = null;
            System.out.print("Введите размерность массива: ");
            if (sc.hasNextInt()){
                arraySize = sc.nextInt();
                //Определение
                array = new int[arraySize];
                //Инициализация
                for (int i = 0; i < array.length; i++) {
                    System.out.print("Введите " + i + "-й элемент массива: ");
                    array[i] =sc.nextInt();
                }
                // Определение числа для удаления элементов
                System.out.println("Введите целое число: ");
                int x = sc.nextInt();
                // Итоговое состояние массива
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == x){
                        arr = new int[array.length-1];
                        for (int index = 0; index < i; index++){
                            arr[index] = array[index];
                        }
                        for (int i1 = i; i1 < array.length-1; i1++){
                            arr[i1] = array[i1+1];
                        }
                        break;
                    }
                }
                //Оригинальное состояние массива
                System.out.println("Оригинальное состояние массива: "+Arrays.toString(array));
                //Итоговое состояние массива
                System.out.println("Итоговое состояние массива: " +Arrays.toString(arr));
            }else{
                System.out.println("Ошибка ввода");
            }
            sc.close();
        }
}