public class RekusiverPascal implements Pascal
{

	private long _zaehler;

	public long[] berechnePascalschesDreieck(int zeile)
	{
		long[] pascal = new long[zeile];

		for (int reihe = 0; reihe < zeile; reihe++)
		{
			_zaehler++;
			pascal[reihe] = function_pascal(zeile - 1, reihe);

		}

		return pascal;
	}

	public long function_pascal(int zeile, int spalte)
	{
		if (spalte == 0 || spalte == zeile)
		{
			return 1;
		}
		_zaehler++;
		return function_pascal(zeile - 1, spalte)
				+ function_pascal(zeile - 1, spalte - 1);
	}

	public long getZaehler()
	{
		return _zaehler;
	}

	public void setZaehler(long zaehler)
	{
		_zaehler = zaehler;
	}

}
