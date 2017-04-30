package Linkedlist;

//Itype.java
interface Itype{
void foo();
}
//Atype.java
class Atype implements Itype{
public void foo(){ System.out.println("in Atype's foo()"); }
public String toString(){ return "I am an Atype object"; }
}
//Btype.java
class Btype extends Atype{
Btype(){ System.out.println("constructing a Btype object"); }
public void foo(){ System.out.println("in Btype's foo()"); }
public void bar(){ System.out.println("in Bytpe's bar()"); }
public String toString(){ return "I am a Btype object"; }
}
//ItypeTest.java
class ITypeTest{
public static void main(String[] args){
Itype I;
Atype A;
Btype B;
A = new Atype();
B = new Btype();
I = A;
A = B;
I.foo();
A.foo();
B.bar();
System.out.println(I);
System.out.println(A);
System.out.println(B);
}
}