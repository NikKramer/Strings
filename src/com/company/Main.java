package com.company;

public class Main {

    public static String LongestString(String [] strings){
        String Maxim = strings[0];
        for(int i=0; i<strings.length;i++){
            if (strings[i].length()>Maxim.length()){
                Maxim = strings[i];
            }
        }
        return Maxim;
    }

    public static boolean IsPalindrom(String string){
        String reversedString = new StringBuffer(string).reverse().toString();
        if (string == reversedString){
            return true;
        }else{return false;}
    }

    public static String Censor(String words){
        return words.replace("бяка","[вырезаны чурки]");
    }

    public static int CounterContained(String Main,String Minor){
        return Main.split(Minor).length ;
    }

    public static StringBuffer Frequency(String text){
        int [] Counter = new int [26];
        char[] NText = text.toCharArray();
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        char[] NStr1 = str1.toCharArray();
        String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] NStr2 = str2.toCharArray();
        for(int i=0;i<NText.length;i++){
            for (int j=0;j<26;j++){
                if(NText[i]==NStr1[j] | NText[i]==NStr2[j]){
                    Counter[j]++;
                }
            }
        }
        StringBuffer Answer = new StringBuffer();
        for(int i=0;i<26;i++){
            Answer.append(NStr1[i]);
            Answer.append("-");
            Answer.append(Counter[i]);
            Answer.append("; ");
        }
        return Answer;
    }

    public static StringBuffer Inversion(String NormalStr){
        String [] words = NormalStr.split(" ");
        StringBuffer InvStr = new StringBuffer("");
        for(String word:words){
           String InvWord = new StringBuffer(word).reverse().toString();
           InvStr.append(InvWord);
        }
        return InvStr;
    }

    public static void main(String[] args) {
	String str1 = "Я человек паук нахуй, паук, пук, паук паук :паук";
    //String str2 = "паук";
        System.out.println(Frequency(str1));
    }
}
