package es.craftsmanship.toledo.katangapp.controllers.callbacks;

import static org.fest.assertions.Assertions.assertThat;

import play.test.TestBrowser;

/**
 * @author mdelapenya
 */
public final class BodyContainsTestCallback extends DefaultBodyTestCallback {

	public BodyContainsTestCallback(
		int serverPort, String endPoint, String message) {

		super(serverPort, endPoint, message);
	}

	@Override
	protected void verifyAssertion(TestBrowser browser) {
		assertThat(browser.pageSource()).contains(messages[0]);
	}

}
