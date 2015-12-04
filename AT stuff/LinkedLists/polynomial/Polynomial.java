package polynomial;

import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial
{
	private LinkedList<Term> p = new LinkedList();

	public void addTerm(Term t)
	{
		addTerm(t.getCoeff(), t.getPower());
	}

	public void addTerm(int coefficient, int power)
	{
		Term term = new Term(coefficient, power);
		ListIterator<Term> ite = this.p.listIterator();
		if (ite.hasNext() && (ite.next().getPower() == power))
		{
			Term term2 = ite.previous().add(term);
			ite.set(term2);
			return;
		}
		if (ite.hasPrevious() && (ite.previous().getPower() < power))
		{
			this.p.addFirst(term);
			return;
		}
		while (ite.hasNext())
		{
			if (ite.next().getPower() == power)
			{
				Term term2 = ite.previous().add(term);
				ite.set(term2);
				return;
			}
			ite.previous();
			if (ite.hasNext() && (ite.next().getPower() < power))
			{
				ite.previous();
				ite.add(term);
				return;
			}
		}
		this.p.addLast(term);
	}

	public Polynomial add(Polynomial other)
	{
		ListIterator<Term> iter = this.p.listIterator();
		ListIterator<Term> oIter = other.getIterator();
		Polynomial newP = new Polynomial();
		while (iter.hasNext()) {
			newP.addTerm((Term)iter.next());
		}
		while (oIter.hasNext()) {
			newP.addTerm((Term)oIter.next());
		}
		return newP;
	}

	public Polynomial derivative()
	{
		ListIterator<Term> iter = this.p.listIterator();
		Polynomial p = new Polynomial();
		while (iter.hasNext())
		{
			Term term = (Term)iter.next();
			p.addTerm(term.getPower() * term.getCoeff(), term.getPower() -1);
		}
		return p;
	}

	public Polynomial multiply(Polynomial other)
	{
		ListIterator<Term> ite = this.p.listIterator();
		ListIterator<Term> aite = other.getIterator();
		Polynomial p = new Polynomial();
		while (ite.hasNext())
		{
			Term term = (Term)ite.next();
			while (aite.hasNext()) {
				p.addTerm(term.multiply((Term)aite.next()));
			}
			aite = other.getIterator();
		}
		return p;
	}

	public ListIterator<Term> getIterator()
	{
		return this.p.listIterator();
	}

	public String toString()
	{
		String ret = "";

		ListIterator<Term> iter = this.p.listIterator();
		while (iter.hasNext()) {
			Term t=iter.next();
			if(t.getCoeff()!=0)
				ret = ret +"+"+ t;
		}
		return ret;
	}
}