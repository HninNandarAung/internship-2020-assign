public class Student{
public static void main(String[] args) {
String[] studentNames = new String[10];//Array to keep string student names
studentNames[0] = "Htet Lwin Aung";//string Htet Lwin Aung  put to  array
studentNames[1] = "Nann May Mi Zhue";//string Nann May Mi Zhue  put to  array
studentNames[2] = "Hnin Yee Aye";//string Hnin Yee Aye  put to  array
studentNames[3] = "Phyo Ei San";//string Phyo Ei San put to  array
studentNames[4] = "Hnin Nandar Aung";//string Hnin Nandar Aung put to  array
studentNames[5] = "Thae Nu San";//string Thae Nu San put to  array
studentNames[6] = "Lwin Nandar Oo";//string Lwin Nandar Oo put to  array
studentNames[7] = "Phyo Zin Mar";//string Phyo Zin Mar put to array
studentNames[8] = "Mi Thike Non";//string Mi Thike Non  put to  array
studentNames[9] = "Khin Thu Thu Ko";//string Khin Thu Thu Ko put to  array

//complete yourself to assign 10 students name
for(int i = 0; i < studentNames.length;i++) //for loop to print studentName 
{ if(studentNames[i] == "Hnin Nandar Aung") {//if condition check name in array with Hnin Nandar Aung
System.out.println("I'm " + studentNames[i]);//to print studentName "I'm Hnin Nandar Aung"
System.out.println();//to print space
System.out.println("and my Index is : " + i); //to print index number where exist studentName
}
}
}
}
