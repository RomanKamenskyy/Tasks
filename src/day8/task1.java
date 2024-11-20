package day8;

public class task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String intString="";
        for (int i=0; i<20001; i++){
            //intString = new StringBuilder().append(intString).append(" ").append(i).toString();
            intString = intString + " " + i;
        }
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < 20000; i++) {
//            stringBuilder.append(i + "");
//        }
        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;

        //        System.out.println(stringBuilder);
        System.out.println(intString);
        System.out.println(timeElapsed);




    }
}
