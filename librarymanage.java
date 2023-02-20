import java.util.*;
public class librarymanage {
public static void main(String args[])
{
	char r;
	do
	{
	System.out.println("**Library Managment System**");
	System.out.println("Press 1 to add Book");
	System.out.println("Press 2 to issue a book");
	System.out.println("Press 3 to return a book");
	System.out.println("Press 4 to print complete issue details");
	System.out.println("Press 5 to exit");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();
	switch(num)
	{
	case 1:
		Library obj=new Library();
		obj.add();
		break;
	case 2:
		Library obj1=new Library();
		obj1.issue();
		break;
	case 3:
		Library obj3=new Library();
		obj3.retur();
		break;
	case 4:
		Library obj4=new Library();
		obj4.detail();
		break;
	case 5:
		Library obj5=new Library();
		obj5.exit();
		break;
		default:
			System.out.println("Invalid number");
	}
	System.out.println("You want to select next option Yes (Y)/ No (N)");
	r=scan.next().charAt(0);
	}
	while(r=='Y'||r=='y');
	if(r=='N'||r=='n');
	{
		Library z=new Library();
		z.exit();
	}
	}
	
}

class Library
{
	static String bookname,issuedate,returndate;
	static int bookid,no_of_book;
void add()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter book name");
	String bookname=scan.nextLine();
	System.out.println("Enter book number");
	int book_no=scan.nextInt();
	System.out.println("Your Details-"+"    "+bookname+"  "+book_no);
}
void issue()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Book name");
	bookname=scan.nextLine();
	System.out.println("Enter a Book id");
	bookid=scan.nextInt();
	System.out.println("Enter a issue date");
	issuedate=scan.nextLine();
	scan.nextLine();//for nextline
	System.out.println("Enter a return date");
	returndate=scan.nextLine();
	System.out.println("total number of Book Issued");
	no_of_book=scan.nextInt();
}
int get_id()
{
	return bookid;
}
void retur()
		{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter student name");
	String name=scan.nextLine();
	System.out.println("Enter Book-id");
	int id=scan.nextInt();
	if(bookid==id)
	{
		System.out.println("Book Details are");
		System.out.println("Book name:"+Library.bookname);
		System.out.println("Book-id:"+Library.bookid);
		System.out.println("Issue date"+Library.issuedate);
		System.out.println("Total number of book issued"+Library.no_of_book);
		System.out.println("Return date"+Library.returndate);
	}
	else
	{
		System.out.println("Invalid id or login");	
	}
		}
void detail()
{
	System.out.println("Book Details are");
	System.out.println("Book name:"+Library.bookname);
	System.out.println("Book-id:"+Library.bookid);
	System.out.println("Total number of book issued"+Library.no_of_book);
	System.out.println("Return date"+Library.returndate);
}
void exit()
{
	System.exit(0);
}
}
