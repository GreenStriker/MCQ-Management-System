/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JudgingSystem;

/**
 *
 * @author MOUKH_PC
 */
public class Item {
    
    
      
    private String Question;
    private String A;
    private String B;
    private String C;
    private String D;
    private String ans;
    
    public Item(String Q, String a, String b,String c,String d,String an)
    {
        this.Question = Q;
        this.A = a;
        this.B = b;
       this.C = c;
       this.D = d;
       
       this.ans = an;
    }
    
    public String getQuestion()
    {
        return Question;
    }
     public String getAns()
    {
        return ans;
    }
    
    
    
    public String getA()
    {
        return A;
    }
    
    public String getB()
    {
        return B;
    }
    public String getC()
    {
        return C;
    }
    public String getD()
    {
        return D;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
