package model.logic;

public class Travel 
{
	private int sourceID;

	private int dstID;

	private int month;

	private double mean_travel_time;

	private double standard_deviation_travel_time;

	private double  geometric_mean_travel_time;

	private double geometric_standard_deviation_travel_time;

	public Travel(int pSource, int pDstID, int pMonth, double pMeanTravelTime, double pStandartDeviationTravelTime, double pGeometricMeanTravelTime, double pGeometricStandart )
	{
		sourceID=pSource;
		dstID=pDstID;
		month=pMonth;
		mean_travel_time=pMeanTravelTime;
		standard_deviation_travel_time=pStandartDeviationTravelTime;
		geometric_mean_travel_time=pGeometricMeanTravelTime;
		geometric_standard_deviation_travel_time=pGeometricStandart;
	}

	// Returns

	public int getSourceID()
	{
		return sourceID;
	}

	public int getDstID()
	{
		return dstID;
	}

	public int getMonth()
	{
		return month;
	}

	public double getMean_travel_time()
	{
		return mean_travel_time;
	}

	public double getStandard_deviation_travel_time()
	{
		return standard_deviation_travel_time;
	}

	public double getGeometric_mean_travel_time()
	{
		return geometric_mean_travel_time;
	}

	public double getGeometric_standard_deviation_travel_time()
	{
		return geometric_standard_deviation_travel_time;
	}

	//Modificadores

	public void setSourceID(int pSourceID)
	{
		this.sourceID=pSourceID;
	}

	public void setDstID(int pDstID)
	{
		this.dstID=pDstID;
	}

	public void setMonth(int pMonth)
	{
		this.month=pMonth;
	}

	public void setMean_travel_time(double pMean_travel_time)
	{
		this.mean_travel_time=pMean_travel_time;
	}

	public void setStandard_deviation_travel_time(double pStandard_deviation_travel_time)
	{
		this.standard_deviation_travel_time=pStandard_deviation_travel_time;
	}

	public void setGeometric_mean_travel_time(double pGeometric_mean_travel_time)
	{
		this.geometric_mean_travel_time=pGeometric_mean_travel_time;
	}
	public void setGeometric_standard_deviation_travel_time(double pGeometric_standard_deviation_travel_time)
	{
		this.geometric_standard_deviation_travel_time=pGeometric_standard_deviation_travel_time;
	}
}
