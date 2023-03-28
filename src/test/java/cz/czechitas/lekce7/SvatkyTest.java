package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Filip Jirsák
 */
class SvatkyTest {

  /**
   * Testuje metodu {@link Svatky#kdyMaSvatek(String)}
   */
  @Test
  void kdyMaSvatek() {
    Svatky svatky = new Svatky();
    assertEquals(MonthDay.of(5, 18), svatky.kdyMaSvatek("Nataša"));
    assertNull(svatky.kdyMaSvatek("Eva"));
    assertNull(svatky.kdyMaSvatek("dfhsjkd"));
  }

  /**
   * Testuje metodu {@link Svatky#jeVSeznamu(String)}
   */
  @Test
  void jeVSeznamu() {
    Svatky svatky = new Svatky();
    assertTrue(svatky.jeVSeznamu("Nataša"));
    assertFalse(svatky.jeVSeznamu("Eva"));
    assertFalse(svatky.jeVSeznamu("dfhsjkd"));
  }

  /**
   * Testuje metodu {@link Svatky#getPocetJmen()}
   */
  @Test
  void getPocetJmen() {
    Svatky svatky = new Svatky();
    assertEquals(37, svatky.getPocetJmen());
    assertNotEquals(-1, svatky.getSeznamJmen());
  }

  /**
   * Testuje metodu {@link Svatky#getSeznamJmen()}
   */
  @Test
  void getSeznamJmen() {
    Svatky svatky = new Svatky();
    assertEquals(37, svatky.getSeznamJmen().size());
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, int)}
   */
  @Test
  void pridatSvatekDenMesicInt() {
    Svatky svatky = new Svatky();
    svatky.pridatSvatek("Narcis", 31, 12);
    assertEquals(38, svatky.getPocetJmen());
    assertTrue(svatky.jeVSeznamu("Narcis"));
    assertEquals(MonthDay.of(12,31),(svatky.kdyMaSvatek("Narcis")));
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, int, Month)}
   */
  @Test
  void pridatSvatekDenMesicMonth() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
  }

  /**
   * Testuje metodu {@link Svatky#pridatSvatek(String, MonthDay)}
   */
  @Test
  void prridatSvatekMonthDay() {
    //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
    Svatky svatky = new Svatky();
  }

  /**
   * Testuje metodu {@link Svatky#smazatSvatek(String)}
   */
  @Test
  void smazatSvatek() {
    //TODO Zkontrolovat, že po smazání bude počet svátků odpovídat novému počtu.
    Svatky svatky = new Svatky();
  }
}
