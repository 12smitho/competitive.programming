import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
for(int i = 0; i < n; i++){
int grade = in.nextInt();
if(grade < 38){
System.out.println(grade);
}
else{
int q = grade/5;
int rem = grade%5;
if(rem >= 3){
System.out.println((q+1)*5);
}
else{
System.out.println(grade);
}
}
}
}
}
