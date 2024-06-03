package com.oussama.save_travels.services;

import com.oussama.save_travels.models.Travel;
import com.oussama.save_travels.repositories.TravelRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TravelService {

    // adding the travel repository as a dependency
    private final TravelRepo travelRepository;
    public TravelService(TravelRepo travelRepository){
        this.travelRepository = travelRepository;
    }

    // RED ALL
    public List<Travel> allTravel(){
        return travelRepository.findAll();
    }

    // CREATE
    public Travel createTravel (Travel travel){
        return travelRepository.save(travel);
    }

    // FIND ONE BY ID
    public Travel findTravel (Long id){
        Optional<Travel> optionalTravel = travelRepository.findById(id);
        return optionalTravel.orElse(null);
    }

    // UPDATE TRAVEL
    public Travel updateTravel(Long id, Travel travelDetails){
        Optional<Travel> optionalTravel = travelRepository.findById(id);
        if(optionalTravel.isPresent()){
            Travel travel = optionalTravel.get();
            travel.setExpense(travelDetails.getExpense());
            travel.setVendor(travelDetails.getVendor());
            travel.setAmount(travelDetails.getAmount());
            travel.setDescription(travelDetails.getDescription());
            return travelRepository.save(travel);
        } else{
            return null;
        }
    }

    // DELETE TRAVEL
    public void deleteTravel(Long id){
        travelRepository.deleteById(id);
    }

}
