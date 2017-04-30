import java.util.HashMap;

class WhileLanguageInterpreter
{
}

 class ArithExpressions //ArithExpressions
 	{                         
	int eval(HashMap<String,Integer> stateTable)
	{
		return 0;
	}
	}
    class Num extends ArithExpressions{//Num Class
		int n;
		Num(int number)
		{
			n=number;
		}
		int eval(HashMap<String,Integer> stateTable){
			return n;
		}
	    }
	class Variable extends ArithExpressions{
		String variable;
		Variable(String variable)
		{
			this.variable=variable;
		}
		int eval(HashMap<String,Integer> stateTable){
			if(!stateTable.containsKey(variable))
				return 0;
			else
			return stateTable.get(variable);
		}
	    }
	class Add extends ArithExpressions{
		ArithExpressions left;
		ArithExpressions right;
		Add(ArithExpressions left, ArithExpressions right){
			this.left = left;
			this.right = right;
		}
		int eval(HashMap<String,Integer> stateTable){
			return left.eval(stateTable) + right.eval(stateTable); 
			
	 	}
	}
	class Mult extends ArithExpressions{
		ArithExpressions left;
		ArithExpressions right;
		Mult(ArithExpressions left, ArithExpressions right){
			this.left = left;
			this.right = right;
		}
		int eval(HashMap<String,Integer> stateTable){
			return left.eval(stateTable) * right.eval(stateTable); 
		}
	}
	class Sub extends ArithExpressions{
		ArithExpressions left;
		ArithExpressions right;
		Sub(ArithExpressions left, ArithExpressions right){
			this.left = left;
			this.right = right;
		}
		int eval(HashMap<String,Integer> stateTable){
			return left.eval(stateTable) - right.eval(stateTable); 
			
	 	}
	}
	class BooleanExpressions 
	{
	boolean eval(HashMap<String,Integer> stateTable)
	{
		return true;
	}			
	}
	class Bool extends BooleanExpressions
	{
	boolean bool;
	Bool(boolean bool)
	{
		this.bool=bool;
	}
	}
	class EqualTo extends BooleanExpressions
	{
	ArithExpressions exp1;
	ArithExpressions exp2;
	EqualTo(ArithExpressions exp1,ArithExpressions exp2)
	{
		this.exp1=exp1;
		this.exp2=exp2;
	}
	boolean eval(HashMap<String,Integer> stateTable)
	{
		if(exp1.eval(stateTable)==exp2.eval(stateTable))
		{
			return true;
		}
			
		else return false;
     }
     }
   class GreaterThan extends BooleanExpressions
   {
	ArithExpressions exp1;
	ArithExpressions exp2;
	GreaterThan(ArithExpressions exp1,ArithExpressions exp2)
	{
		this.exp1=exp1;
		this.exp2=exp2;
	}
	boolean eval(HashMap<String,Integer> stateTable)
	{
		if(exp1.eval(stateTable)>exp2.eval(stateTable))
			return true;
		else return false;
	}
    }
   class Complement extends BooleanExpressions
   {
	BooleanExpressions bexp;
	Complement(BooleanExpressions bexp)
	{
		this.bexp=bexp;
	}
	boolean eval(HashMap<String,Integer> stateTable)
	{
		if(this.bexp.eval(stateTable)==true)
			return false;
		else
			return true;
	}
     }
    class BooleanAnd extends BooleanExpressions
    {
	BooleanExpressions bexp1;
	BooleanExpressions bexp2;
	BooleanAnd(BooleanExpressions bexp1,BooleanExpressions bexp2)
	{
		this.bexp1=bexp1;
		this.bexp2=bexp2;
	}
	boolean eval(HashMap<String,Integer> stateTable)
	{
		if(bexp1.eval(stateTable)==true && bexp2.eval(stateTable)==true)
		 return true;
		 else return false;
	}
    }
    class BooleanOr extends BooleanExpressions
    {
	BooleanExpressions bexp1;
	BooleanExpressions bexp2;
	BooleanOr(BooleanExpressions bexp1,BooleanExpressions bexp2)
	{
		this.bexp1=bexp1;
		this.bexp2=bexp2;
	}
	boolean eval(HashMap<String,Integer> stateTable)
	{
		if(bexp1.eval(stateTable)==false && bexp2.eval(stateTable)==false)
		 return false;
		 else return true;
	}
    }
/*------------Funky added expression------------------*/
    class BooleanXOR extends BooleanExpressions
    {
	BooleanExpressions bexp1;
	BooleanExpressions bexp2;
	BooleanXOR(BooleanExpressions bexp1,BooleanExpressions bexp2)
	{
		this.bexp1=bexp1;
		this.bexp2=bexp2;
	}
	boolean eval(HashMap<String,Integer> stateTable)
	{
		if(bexp1.eval(stateTable)==(bexp2.eval(stateTable)))
		 return false;
		 else return true;
	}
    }
/*------------------------------------------------------------*/

    class CommandExpressions 
    {
	void eval(HashMap<String,Integer> stateTable)
	{
	}
    }
    class Assign extends CommandExpressions
    {
	ArithExpressions exp;
	Variable v;
	String variable;
	Assign(Variable v,ArithExpressions exp)
	{
		this.v=v;
		this.exp=exp;
		variable=v.toString();
	}
	void eval(HashMap<String,Integer> stateTable)
	{
		stateTable.put(v.variable, exp.eval(stateTable));
	}
    }
    class Skip extends CommandExpressions
    {
	CommandExpressions cexp;
	Skip(CommandExpressions cexp)
	{
		this.cexp=cexp;
	}
	void eval(HashMap<String,Integer> stateTable)
	{
	return;
	}
    }
    class Compound extends CommandExpressions
    {
	CommandExpressions cexp1;
	CommandExpressions cexp2;
	Compound(CommandExpressions cexp1,CommandExpressions cexp2)
	{
		this.cexp1=cexp1;
		this.cexp2=cexp2;
	}
    }
    class CommandIf extends CommandExpressions
    {
	CommandExpressions cexp1;
	CommandExpressions cexp2;
	BooleanExpressions bexp;
	CommandIf(CommandExpressions cexp1,CommandExpressions cexp2,BooleanExpressions bexp)
	{
		this.cexp1=cexp1;
		this.cexp2=cexp2;
		this.bexp=bexp;
	}
	void eval(HashMap<String,Integer> stateTable)
	{
		if(bexp.eval(stateTable)==true)
		{
			cexp1.eval(stateTable);
		}
		else if(bexp.eval(stateTable)==false)
		{
			cexp2.eval(stateTable);
		}
	}
    }

    class CommandWhile extends CommandExpressions
    {
	CommandExpressions cexp1;
	BooleanExpressions bexp;
	
	CommandWhile(BooleanExpressions bexp,CommandExpressions cexp1)
	{
		this.cexp1=cexp1;
		this.bexp=bexp;
	}
	void eval(HashMap<String,Integer> stateTable)
	{
		while(bexp.eval(stateTable)==true)
			{
				cexp1.eval(stateTable);
			}
		
	while(bexp.eval(stateTable)==false)
	{
		return;
	}
	}
    }