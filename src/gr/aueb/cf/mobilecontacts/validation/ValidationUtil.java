package gr.aueb.cf.mobilecontacts.validation;

import gr.aueb.cf.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.mobilecontacts.dto.MobileContactUpdateDTO;

public class ValidationUtil {
    /**
     * No instances of this class should be available.
     */
    private ValidationUtil(){

    }

    public static String validateDTO(MobileContactInsertDTO insertDTO){
        String errorResponse = "";

        if (insertDTO.getPhoneNumber().length() <= 5)
            errorResponse += "Ο Τηλεφωνικός Αριθμός πρέπει να έχει περισσότερα από πέντε σύμβολα.\n";
        if (insertDTO.getPhoneNumber().length() < 2)
            errorResponse += "Ο Τηλεφωνικός Αριθμός πρέπει να περιέχει δύο ή περισσότερους χαρακτήρες.\n";
        if (insertDTO.getLastname().length() < 2)
            errorResponse += "Το Επώνυμο πρέπει να περιέχει δύο ή περισσότερους χαρακτήρες.\n";

        return errorResponse;
    }

    public static String validateDTO(MobileContactUpdateDTO updateDTO){
        String errorResponse = "";

        if (updateDTO.getPhoneNumber().length() <= 5)
            errorResponse += "Ο Τηλεφωνικός Αριθμός πρέπει να έχει περισσότερα από πέντε σύμβολα.\n";
        if (updateDTO.getPhoneNumber().length() < 2)
            errorResponse += "Ο Τηλεφωνικός Αριθμός πρέπει να περιέχει δύο ή περισσότερους χαρακτήρες.\n";
        if (updateDTO.getLastname().length() < 2)
            errorResponse += "Το Επώνυμο πρέπει να περιέχει δύο ή περισσότερους χαρακτήρες.\n";

        return errorResponse;
    }
}
