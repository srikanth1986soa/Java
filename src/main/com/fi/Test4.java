package main.com.fi;

class Test4
{
public static void main(String args[])
{
List<String> names =
Arrays.asList("Falir","FalirQuiz","g1","QA","Flair22");
Predicate<String> p = (s)->s.startsWith("G");
for (String st:names)
{
if (p.test(st))
System.out.println(st);
}
}
}