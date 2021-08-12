package com.OOPS.stackOperations;

public class FixedStack implements stackop{
	
	
	  private int stk[ ];
      private int tos;
      FixedStack(int size)
      {
              stk=new int[size];
              tos=-1;
      }


      @Override
      public void push(int item) {
    	  if(tos==stk.length-1)
          {
                  System.out.println("Stack Overflows");
                  int t[ ]=new int[stk.length * 2];
                  for(int i=0;i<stk.length;i++)
                          t[i]=stk[i];
                  stk=t;
                  stk[++tos]=item;
          }
          else
                  stk[++tos]=item;

      }

      @Override
      public int pop() {
    	  if(tos<0)
    	  {
    		  System.out.println("Stack Underflows");
    		  return 0;
    	  }
    	  else
    		  return stk[tos--];
      }
}


