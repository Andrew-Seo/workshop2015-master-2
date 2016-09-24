package Level_3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Trip
{
	ArrayList<Flight> flights = new ArrayList<Flight>();

	public void add(Flight f)
	{
		flights.add(f);
	}

	public int getNumberOfFlights()
	{
		int size = flights.size();
		return size;
	}

	public void clear()
	{
		flights.clear();
	}

	public int getDuration()
	{
		if (flights.size() >= 1)
		{
			Flight start = flights.get(0);
			Flight last = flights.get(flights.size() - 1);
			Time S1 = start.getDepartureTime();
			Time L1 = last.getArrivalTime();

			return S1.minutesUntil(L1);
		}

		else
		{
			return 0;
		}
	}

	public int getShortestLayover()
	{
		int leastTime = Integer.MAX_VALUE;
		for (int i = 0; i < flights.size() -1; i++)
		{
			Flight start = flights.get(i);
			Flight last = flights.get(i+1);
			Time S1 = start.getArrivalTime();
			Time L1 = last.getDepartureTime();
			int x = L1.minutesUntil(S1);
			if (x <= leastTime)
			{
				leastTime = x;
			}
		}
		return leastTime;
	}
	
}
