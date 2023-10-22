package tn.esprit.advertising.Interfaces;
import tn.esprit.advertising.Entities.Advertising;


import java.util.Date;
import java.util.List;

public interface IAdvertisingService {
    List<Advertising> getAllAdvertising(); // ok
    void deleteById(Long idAdvertising); // ok
    Advertising addAdvertising(Advertising ad);
    Advertising updateAdvertising(Advertising add);
    Advertising getAdvertisingById(Long idAd);


    double calculerGainPublicitaire(Advertising advertising);

    Long calculerNbreDesJours(Advertising advertising);


    List<Advertising> getAdvertisingBetweenTwoDates(Date startDate, Date endDate);
}
