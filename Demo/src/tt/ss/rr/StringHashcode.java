package tt.ss.rr;

import java.lang.String;
import java.lang.System;
/**
 * hashCode
 * 
 * @author Tyousaryuu
 *
 * 2021Äê6ÔÂ25ÈÕ
 */
public class StringHashcode {
	public static void main(String[] args) {
		System.out.println("a".hashCode());
		System.out.println("b".hashCode());
		System.out.println("ab".hashCode());// 97*31+98
		System.out.println(97*31+98);// 97*31+98
	}
//	public int hashCode() {
//        int h = hash;
//        if (h == 0 && value.length > 0) {
//            char val[] = value;
//
//            for (int i = 0; i < value.length; i++) {
//                h = 31 * h + val[i];
//            }
//            hash = h;
//        }
//        return h;
//    }
}
