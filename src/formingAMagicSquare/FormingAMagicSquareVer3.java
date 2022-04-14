package formingAMagicSquare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormingAMagicSquareVer3 {
    public static void main(String[] args) {
        /*

        */
        // 함수에서 들어온 매개변수 만들기
        List<Integer> i1 = new ArrayList<>(Arrays.asList(4,8,2));
        List<Integer> i2 = new ArrayList<>(Arrays.asList(4,5,7));
        List<Integer> i3 = new ArrayList<>(Arrays.asList(6,1,6));
        List<List<Integer>> s = new ArrayList<>();
        s.add(i1);
        s.add(i2);
        s.add(i3);

        // 문제 풀이 시작!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        int[][][] magicSquare = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}}, {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}}, {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}}, {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}};

        int result = 27;
        int temp = 0;
        for(int k = 0; k < magicSquare.length; k++){
            for(int i = 0; i < magicSquare[k].length; i++){
                for (int j = 0; j < magicSquare[k][i].length; j++){
                    temp += Math.abs(s.get(i).get(j) - magicSquare[k][i][j]);
                }
            }
            result = Math.min(result,temp);
            temp = 0;
        }
        System.out.println(result);




        // 데이터 진행 건들지 않아도 된다.!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        int[] arCheckNum = new int[10];
//        int result =0;
//        for(int i = 0; i<s.size(); i++){
//            for(int j = 0; j <s.get(i).size(); j++){
//                arCheckNum[s.get(i).get(j)] += 1;
//            }
//        }
//
//        System.out.println("현재 데이터");
//
//        // 데이터 확인
//        for (int i = 1; i< 10; i++){
//            System.out.print("[" +i + "]"+ "\t\t");
//        }
//        System.out.println();
//        for(int i = 1; i<arCheckNum.length; i++){
//            System.out.print(arCheckNum[i] + "\t\t");
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println("현재 배열");
//        for (int i = 0; i<s.size(); i++){
//            System.out.print("\t");
//            for(int j =0; j<s.get(i).size(); j++){
//                System.out.print(s.get(i).get(j) + "\t");
//            }
//            System.out.print(" |" + s.get(i).stream().mapToInt(Integer::intValue).sum());
//            System.out.println();
//        }
//        System.out.println("-\t-\t-\t-\t-\t");
//        int sum =0;
//        System.out.print(s.get(0).get(2) + s.get(1).get(1) + s.get(2).get(0) + "\t");
//        System.out.print(s.get(0).get(0) + s.get(1).get(0) + s.get(2).get(0) + "\t");
//        System.out.print(s.get(0).get(1) + s.get(1).get(1) + s.get(2).get(1) + "\t");
//        System.out.print(s.get(0).get(2) + s.get(1).get(2) + s.get(2).get(2) + "\t");
//        System.out.print(s.get(0).get(0) + s.get(1).get(1) + s.get(2).get(2) + "\t");
    }
}
