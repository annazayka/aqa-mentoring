package Framework;

import org.apache.log4j.Logger;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;


public class Listener implements WebDriverEventListener {




 Logger log = Logger.getLogger(Listener.class);


 @Override
 public void beforeAlertAccept(WebDriver driver) {

 }

 @Override
 public void afterAlertAccept(WebDriver driver) {

 }

 @Override
 public void afterAlertDismiss(WebDriver driver) {

 }

 @Override
 public void beforeAlertDismiss(WebDriver driver) {

 }

 @Override
 public void beforeNavigateTo(String url, WebDriver driver) {
  //PropertyConfigurator.configure(path);

  log.info("Test is going to navigate to  "+url);
 };


 @Override
 public void afterNavigateTo(String url, WebDriver driver) {

 }

 @Override
 public void beforeNavigateBack(WebDriver driver) {

 }

 @Override
 public void afterNavigateBack(WebDriver driver) {

 }

 @Override
 public void beforeNavigateForward(WebDriver driver) {

 }

 @Override
 public void afterNavigateForward(WebDriver driver) {

 }

 @Override
 public void beforeNavigateRefresh(WebDriver driver) {

 }

 @Override
 public void afterNavigateRefresh(WebDriver driver) {

 }

 @Override
 public void beforeFindBy(By by, WebElement element, WebDriver driver) {
  log.info("Test is going to find elem by  "+ by);

 }

 @Override
 public void afterFindBy(By by, WebElement element, WebDriver driver) {
  log.info(" elem   "+ by + "was found");
 }

 @Override
 public void beforeClickOn(WebElement element, WebDriver driver) {

 }

 @Override
 public void afterClickOn(WebElement element, WebDriver driver) {

 }

 @Override
 public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

 }

 @Override
 public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

 }

 @Override
 public void beforeScript(String script, WebDriver driver) {

 }

 @Override
 public void afterScript(String script, WebDriver driver) {

 }

 @Override
 public void beforeSwitchToWindow(String windowName, WebDriver driver) {

 }

 @Override
 public void afterSwitchToWindow(String windowName, WebDriver driver) {

 }

 @Override
 public void onException(Throwable throwable, WebDriver driver) {

 }

 @Override
 public <X> void beforeGetScreenshotAs(OutputType<X> target) {

 }

 @Override
 public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

 }

 @Override
 public void beforeGetText(WebElement element, WebDriver driver) {


  log.info("Get test from  "+ element);

 }

 @Override
 public void afterGetText(WebElement element, WebDriver driver, String text) {

  log.info("succesully found "+ element);
 }
}