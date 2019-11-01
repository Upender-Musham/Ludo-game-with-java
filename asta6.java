	
import java.util.*;
class asta6{
	String car[][]=new String[5][5];
         String emmsg=null;
	int samp1=0,samp2=0;
        String player1=null;
        String player2=null;
	              String[] travels1={"0$2","0$1","0$0","1$0","2$0","3$0","4$0","4$1","4$2","4$3","4$4","3$4","2$4","1$4","0$4","0$3","1$3","2$3","3$3","3$2","3$1","2$1","1$1","1$2","2$2"};
	String[] travels2={"4$2","4$3","4$4","3$4","2$4","1$4","0$4","0$3","0$2","0$1","0$0","1$0","2$0","3$0","4$0","4$1","3$1","2$1","1$1","1$2","1$3","2$3","3$3","3$2","2$2"};
	
        boolean killchk=false;
          String out1=null;
            String out2;
            int diceback=0;
	asta6(String a,String b){
            
            player1=a;
            player2=b;
            out1="1111";
          out2= "2222";
            System.out.println(player1+"\n"+player2);
                
		for(int i=0;i<=4;i++){
		
			for(int j=0;j<=4;j++){
				car[i][j]="duffer";
                               
						
			}
		}
  
		car[0][2]="s";
		
		car[2][0]="s";car[2][2]="s";
                car[4][2]="s";car[2][4]="s";

		
	
		for(int i=0;i<=4;i++){
			for(int j=0;j<=4;j++){
				if(car[i][j].equals("duffer")==true)
				car[i][j]="n";
			}
		}
        
	
        }

	int generate(){

	Random r=new Random();
	int s=(r.nextInt())%10;
	while(s<=0||s>=9||(s>4&&s<8)){
	s=((r.nextInt())%10);
	}
	return (s);
	}



	void showme(){
		for(int i=0;i<=4;i++){
			System.out.print("\n");
			for(int j=0;j<=4;j++){
				String cmn=give(car[i][j]);
				System.out.print(cmn);	
				System.out.print("\t");	
			}
		}


	}

	String give(String temp){
		
		int lengthof=temp.length();
		String temp2=new String();
		if(lengthof==1){
			
			if(temp.charAt(0)=='n')
			{
				temp2=" ";
				
			}
			else{
				temp2="Safe"; 
			}
		}	
		else {
			if(temp.charAt(0)=='n')
			{
				temp2=" ";
				
			}
			else if(temp.charAt(0)=='s'){
				temp2="#";
			}
                                                                    
			for(int i=1;i<lengthof;i++){
				if(temp.charAt(i)=='1'){
					temp2=temp2+"*";
				
				}
				else if(temp.charAt(i)=='2')
					temp2=temp2+"$";
			}
			
		}
		return temp2;
	
	}
String coinat[]=new String[4];
int k=0;
void getcoins(char use){
    k=0;
    String user;
    if( use=='1')
        user="1";
    else
        user="2";
    
    for(int i=0;i<=4;i++){
        for(int j=0;j<=4;j++){
            if(car[i][j].contains(user)){
                int tt=car[i][j].length()-1;
                while(tt>0){
                    if(car[i][j].charAt(tt)==use){
                coinat[k]=new String(i+"$"+j);
                k++;}
                    tt--;
                }
            }
        }
    }
}		
boolean chance=false;	
String enter(char a,int dice){
    String ret=null;
    
    if(a=='1'){
        if((out1!=null)&&(dice==4))
        {
          StringBuffer sd=new StringBuffer(out1);
          sd.deleteCharAt(0);
          out1=new String(sd);
          car[0][2]=car[0][2]+"1";
          
        }
        else if((out1!=null)&&(dice==8)){
             StringBuffer sd=new StringBuffer(out1);
             sd.deleteCharAt(0);
             if(sd.length()!=0){
              sd.deleteCharAt(0);
          out1=new String(sd);
          car[0][2]=car[0][2]+"11";}
             else{
                 out1=new String(sd);
          car[2][0]=car[2][0]+"1";
          
          }
             
             }
        
        else if(out1==null){
            ret="No coin Found";
        }
    }
        else   if(a=='2'){
        if((out2!=null)&&(dice==4))
        {
          StringBuffer sd=new StringBuffer(out2);
          sd.deleteCharAt(0);
          out2=new String(sd);
          car[4][2]=car[4][2]+"2";
          
        }
        else if((out2!=null)&&(dice==8)){
             StringBuffer sd=new StringBuffer(out2);
             sd.deleteCharAt(0);
             if(sd.length()!=0){
              sd.deleteCharAt(0);
          out2=new String(sd);
          car[4][2]=car[4][2]+"22";}
             else{
                 out2=new String(sd);
          car[2][4]=car[2][4]+"2";
          }
             
             }
        
        else if(out2==null){
            ret="No coin Found";
        }
    }
    
return ret;
}
	

String mmg=null;
 int chop=1;
	String insert(char use,int dic,int pr1,int pr2) throws StringIndexOutOfBoundsException{
            chop=0;
              int p=pr1;
              int q=pr2;
              char user=use;
              System.out.println(use);              boolean chk=false;
              int dice=dic;
              
              int lent=car[p][q].length();
              if(lent==1){
                  mmg="coin not found";
                  chop=0;}
              else{
                  if((car[p][q].charAt(0)=='n')&&(car[p][q].charAt(1)==user)){
                      mmg="kk";chk=true;
                      mmg=insert2(user,p,q,dic);}
                  else if((car[p][q].charAt(0)=='n')&&((car[p][q].charAt(1)!=user))){
                      mmg="coin not found";chop=0;}
                  else if((car[p][q].charAt(0)=='s')){
                      for(int i=0;i<lent;i++){
                          if(car[p][q].charAt(i)==user){
                              chk=true;
                             mmg=insert2(user,p,q,dic);
                             break;
                          }
                          
                      }
                  }
                  if(!chk){
                      mmg="coin not found";
                      chop=0;
                  }
              }
              return mmg;
                  
		
		
	}
int i1=-1,i2=-1;
      boolean   killchance=false;
	 String insert2(char user,int p,int q,int die) throws ArrayIndexOutOfBoundsException
	{
            killchk=false;
            chop=1;
           
            String teempp=null;
            System.out.println(p+""+q+""+die);
		int userAt=1;
		int user2At=1;
		StringBuffer sbuff=new StringBuffer(car[p][q]);
		int temp=die;
		int stlen=sbuff.length();
		 i1=-1;i2=-1;
		char[] t=new char[1];
		char[] t2=new char[1];
		String tempar=new String();
		if(user=='1'){
			for(String te:travels1)
			{
				t[0]=te.charAt(0);
				t2[0]=te.charAt(2);
				String  ss1=new String(t);
				String  ss2=new String(t2);
				int temp1=Integer.parseInt(ss1);
				int temp2=Integer.parseInt(ss2);
				if((temp1==p)&&(temp2==q))
				break;
				else
				userAt++;
			}
			int next=(userAt+die)-1;
			if((next>=16)&&(samp1==0))
			{
				teempp="u didnt killed atleast one.";
                                chop=0;
				return teempp;
			}
			
			
			if(next>25){
				teempp="Sorry not possible";
                                chop=0;
				return teempp;
			}
                        tempar=travels1[next];
		
			
		
		}
		else if(user=='2'){
			for(String te:travels2)
			{
				
				t[0]=te.charAt(0);
				t2[0]=te.charAt(2);
				String  ss1=new String(t);
				String  ss2=new String(t2);
				int temp1=Integer.parseInt(ss1);
				int temp2=Integer.parseInt(ss2);
				if((temp1==p)&&(temp2==q))
				break;
				else
				userAt++;
			}
			int next=(userAt+die)-1;
			if((next>=16)&&(samp2==0))
			{
				teempp="u didnt killed atleast one..";chop=0;
				return teempp;
			}
			
			
			if(next>25){
				teempp=" not possible";chop=0;
				return teempp;
			}
			
                        tempar=travels2[next];
		

		}
		t[0]=tempar.charAt(0);
		t2[0]=tempar.charAt(2);
		String  s1=new String(t);
		String  s2=new String(t2);
		i1=Integer.parseInt(s1);
		i2=Integer.parseInt(s2);
		if((car[i1][i2].length()==2)&&(car[i1][i2].charAt(1)==user)&&(car[i1][i2].charAt(0)=='n')){
			teempp="thats a wrong entry..\n";chop=0;return teempp;}
		for(int i=1;i<stlen;i++)
		{
			if(sbuff.charAt(i)==user)
			{
				sbuff.deleteCharAt(i);
				car[p][q]=new String(sbuff);
                                
				break;
			}		
		}
		
		
		if(car[i1][i2].charAt(0)=='n')
		{
			if((car[i1][i2].length()==2)&&(car[i1][i2].charAt(1)==user)){
			teempp="thats a wrong entryn";chop=0;return teempp;}
			else{
			char appo='a';
			stlen=car[i1][i2].length();
			if(user=='1')
				appo='2';
			if(user=='2')
				appo='1';
			if((stlen==2)&&(car[i1][i2].charAt(1)!=user)){
					if(user=='1')
					samp1++;
					else
					samp2++;
                                        if(appo=='1'){killchk=true;
		killchance=true;
                                        teempp="u killed "+player1+" *Congrats* ";
                                        }
                                        else if(appo=='2'){killchk=true;killchance=true;
                                           teempp="u killed "+player2+" *Congrats*";}
                                        
                                        
					StringBuffer sbs=new StringBuffer(car[i1][i2]);
					sbs.deleteCharAt(1);
					sbs.append(user);
					car[i1][i2]=new String(sbs);
					if(user=='1'){
						out2=out2+"2";
					}
					else if(user=='2')
						out1=out1+"1";
			}
			else
			{
				char[] ch=new char[1];
				ch[0]=user;
				String userr=new String(ch);
					car[i1][i2]=car[i1][i2]+userr;
			}
		}}
		else if(car[i1][i2].charAt(0)=='s'){
			
			car[i1][i2]=car[i1][i2]+user;
			return teempp;
		}
		
                 showme();return teempp;
	
	}
	
}



class intr{
	int chekke(){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n\n1.Play \n2.How to play??\n");
		int dec=sc.nextInt();
		int tryi=1;
		
		switch(dec){
			case 1:for(int i=1;i<=100;i++){
					if(i==50){
						System.out.print("Get Ready");					
					}				
					else
						System.out.print("*");
				} System.out.print("\n");tryi=1;break;

			case 2:System.out.println("\t\t\t***AStA ChEmmA***");
				System.out.println("->To play this game two players required..\n->each player will given seperate symbols(4 per player)..\n->dice will decide the no of moves..\n->user has to give the place which symbol .our system will check that place if it possible it will inserted..\n->user has to kill atleast one opponent symbol to enter into the inner way..\n->if a player 4 symbols reaches the goal he will be the winner..\n\t\t *All the best*...\n-->u wana try??(0/1)");tryi=chekke();break;
			default:System.out.println("fuck off\n");
				return 0;

			
				
		}
		return tryi;
	
			
	}
	
	

}


	


