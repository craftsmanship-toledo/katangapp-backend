package es.craftsmanship.toledo.katangapp.business;

import es.craftsmanship.toledo.katangapp.business.http.HttpService;
import es.craftsmanship.toledo.katangapp.business.store.Store;
import es.craftsmanship.toledo.katangapp.models.QueryResult;

/**
 * @author mdelapenya
 */
public interface Finder {

	QueryResult findRoutes(double latitude, double longitude, int radius);

	ClosestPointsAlgorithm getAlgorithm();

	HttpService getHttpService();

	Store getStore();

}