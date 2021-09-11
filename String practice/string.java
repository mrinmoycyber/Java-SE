package stringpractice;
public class StringPractice{
public static void main(String args[]){
String str1="Java Program";  /*Java program is in string pool area.. 
str1(reference) is holding or pointing this object(Java Program)*/
System.out.println(str1);
String str2= new String("Java");  /*This string(new String)will be created in heap. When we say new, so it will be
crated in heap and this reference(str2) holding the object.Here also we us a literal(Java)*/
System.out.println(str2);
char c[]={'H','E','L','L','O'};
String str3=new Sting (c);
System.out.println(str3);
byte b[]= {65, 66, 67, 68};
String str4= new String(b);
System.out.println(str4);
byte d[]={48,49,53,32};
String str5= new String(d, 1, 3);
System.out.println(str5);

}}
