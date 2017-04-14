import static org.junit.Assert.assertEquals;

import org.junit.Test;




public class RekusivePascalCopyTest
{	
	public RekusivePascalCopyTest()
	{}
	
	@Test
    public void DreieckTest()
    {
		long[] dreickezeile;
		
		dreickezeile = RekusivPascalCopy.berechnePascalschesDreieck(1);
		assertEquals(1, dreickezeile[0]);
		
		dreickezeile = RekusivPascalCopy.berechnePascalschesDreieck(2);
		assertEquals(1, dreickezeile[0]);
		assertEquals(1, dreickezeile[1]);
		
		dreickezeile = RekusivPascalCopy.berechnePascalschesDreieck(3);
		assertEquals(1, dreickezeile[0]);
		assertEquals(2, dreickezeile[1]);
		assertEquals(1, dreickezeile[2]);
		
		dreickezeile = RekusivPascalCopy.berechnePascalschesDreieck(4);
		assertEquals(1, dreickezeile[0]);
		assertEquals(3, dreickezeile[1]);
		assertEquals(3, dreickezeile[2]);
		assertEquals(1, dreickezeile[3]);
		
		
		dreickezeile = RekusivPascalCopy.berechnePascalschesDreieck(5);
		assertEquals(1, dreickezeile[0]);
		assertEquals(4, dreickezeile[1]);
		assertEquals(6, dreickezeile[2]);
		assertEquals(4, dreickezeile[3]);
		assertEquals(1, dreickezeile[4]);
		
		dreickezeile = RekusivPascalCopy.berechnePascalschesDreieck(6);
		assertEquals(1, dreickezeile[0]);
		assertEquals(5, dreickezeile[1]);
		assertEquals(10, dreickezeile[2]);
		assertEquals(10, dreickezeile[3]);
		assertEquals(5, dreickezeile[4]);
		assertEquals(1, dreickezeile[5]);
		
		dreickezeile = RekusivPascalCopy.berechnePascalschesDreieck(11);
		assertEquals(1, dreickezeile[0]);
		assertEquals(10, dreickezeile[1]);
		assertEquals(45, dreickezeile[2]);
		assertEquals(120, dreickezeile[3]);
		assertEquals(210, dreickezeile[4]);
		assertEquals(252, dreickezeile[5]);
		assertEquals(210, dreickezeile[6]);
		assertEquals(120, dreickezeile[7]);
		assertEquals(45, dreickezeile[8]);
		assertEquals(10, dreickezeile[9]);
		assertEquals(1, dreickezeile[10]);
    }
	
    @Test
    public void FakultaetTest()
    {
        assertEquals(1, BinominalDreieck.getFakultaetvon(0));
        assertEquals(1, BinominalDreieck.getFakultaetvon(1));
        

        assertEquals(24, BinominalDreieck.getFakultaetvon(4));
        

        assertEquals(120, BinominalDreieck.getFakultaetvon(5));
        
        assertEquals(3628800, BinominalDreieck.getFakultaetvon(10));
    }
	
}
