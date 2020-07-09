package kuntosali.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import kuntosali.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2020.06.28 15:59:03 // Generated by ComTest
 *
 */
@SuppressWarnings({ "all" })
public class AsiakasTest {


  // Generated by ComTest BEGIN
  /** testGetNimi36 */
  @Test
  public void testGetNimi36() {    // Asiakas: 36
    Asiakas asiakas = new Asiakas(); 
    asiakas.taytaAsiakas(); 
    { String _l_=asiakas.getNimi(),_r_="Ismo Laitela .*"; if ( !_l_.matches(_r_) ) fail("From: Asiakas line: 39" + " does not match: ["+ _l_ + "] != [" + _r_ + "]");}; 
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testRekisteroi91 */
  @Test
  public void testRekisteroi91() {    // Asiakas: 91
    Asiakas testi1 = new Asiakas(); 
    assertEquals("From: Asiakas line: 93", 0, testi1.getTunnusNro()); 
    testi1.rekisteroi(); 
    Asiakas testi2 = new Asiakas(); 
    testi2.rekisteroi(); 
    int n1 = testi1.getTunnusNro(); 
    int n2 = testi2.getTunnusNro(); 
    assertEquals("From: Asiakas line: 99", n2-1, n1); 
  } // Generated by ComTest END
}