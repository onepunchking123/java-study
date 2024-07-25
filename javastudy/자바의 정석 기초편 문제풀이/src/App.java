import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    /*
        //자바의 정석 문제4-2
    int sum=0;
    for(int i=0;i<=20;i++){

        if((i%2!=0)&&(i%3!=0))
        {
            sum+=i;
        }
    }
    System.out.println(sum);
    
    
    
    sum=0;       
    //자바의 정석 문제 4-3
    
    for(int i=1;i<=10;i++)
    {
        for(int j=1;j<=i;j++)
        {
            sum+=j;
        }
    }
    System.out.println(sum);

    

    //자바의 정석 문제 4-4
    int cnt=0,i=1,result=0;
    sum=0;
    while(true){
        if(sum>=100)
        {
            result=i;
            break;
        }
        if(i%2==0){
            sum-=i;
            cnt++;
        }
        else{
            sum+=i;
            cnt++;
        }
        i++;
    }
    System.out.println("sum:"+sum);
    System.out.println("cnt:"+cnt);
    System.out.println(result); 
    
    
    // 자릿수 더하기 문제 풀이 2가지
    String str="12345";
    int sum=0;
    for(int i=0;i<str.length();i++)
    {
        int k= str.charAt(i)-48;
        sum+=k;
    }
    System.out.println(sum);

    sum=0;
    int num=Integer.parseInt(str);
    while(num>0){
        sum+=(num%10);
        num/=10;
    }
    System.out.println(sum);
    


    // 숫자 맞추기 게임
    int answer = (int)(Math.random()*100)+1;   
    int input= 0;
    int count =0;
    System.out.println(answer);
    Scanner sc =new Scanner(System.in);   
    loop1:while(true)
    {
        System.out.println("1과100사이의 값을 입력하세요");
        count++;
        input=sc.nextInt();

        int k=0;
        k= (input==answer) ? 1: ((input<answer) ? 2:3);
        switch(k){
            case 2:
                System.out.println("더 큰 수를 입력하세요");
                break;
            case 3:
                System.out.println("더 작은 수를 입력하세요");
                break;
            case 1:
                System.out.println("맞혔습니다.");
                break loop1;
        }
    }
    System.out.println("시도횟수는 "+count+"번입니다.");
    }
    
    int[] arr ={10,20,30,40,50};
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
        sum+=arr[i];
    }    
    System.out.println(sum);
    

    int[][] arr ={
        {5,5,5,5,5},
        {10,10,10,10,10},
        {20,20,20,20,20},
        {30,30,30,30,30}
    };
    int total=0;
    float average=0;
    int cnt=0;
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            total+=arr[i][j];
            cnt++;
        }
    }
    average= (total+0.0f)/cnt;
    System.out.println(total);
    System.out.println(average);
    */

    }   
}