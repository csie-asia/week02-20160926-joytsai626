package ex;

import java.util.Scanner;

/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021013 蔡孟璇
 */

public class ex01_105021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		float a=src.nextInt();
        double p=0.5;
        double d=0;
        if(a<600){
         d=a*p;}
        if(a>=600 && a<=1200){
        d=a*p*0.9;
	}else{
		 d=a*p*0.79;}
        System.out.println(d);
     

			
}
 
	}
