package edu.wheaton.paxos;

import java.util.Collection;
import java.util.HashSet;

public class Bag<E> extends HashSet<E>
{
	@Override
	public boolean remove(Object arg0)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException();
	}

	private static final long serialVersionUID = -6522277849689435112L;
}
