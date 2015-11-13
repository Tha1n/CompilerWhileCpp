package whileComp.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

/* @InjectWith(/* name is null */) */@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class PrettyPrinterTest {
  @Inject
  private /* ParseHelper<Model> */Object parser;
  
  @Inject
  private /* MyDslGenerator */Object genToTest;
  
  @Test
  public void testNameOfAFunction() {
    throw new Error("Unresolved compilation problems:"
      + "\nprogramme cannot be resolved"
      + "\nfonctions cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  @Test
  public void testMyDslGen() {
    throw new Error("Unresolved compilation problems:"
      + "\ndoGenerate cannot be resolved"
      + "\neResource cannot be resolved"
      + "\ndoGenerate cannot be resolved"
      + "\neResource cannot be resolved");
  }
}
