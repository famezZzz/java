import java.time.LocalDate;
import java.util.Random;

enum HotelType {
    ONE_STAR, THREE_STARS, FOUR_STARS, FIVE_STARS
}

class HotelBooking {
    public int bookHotel(HotelType hotelType, int days) {
        return switch (hotelType) {
            case ONE_STAR -> 100 * days;
            case THREE_STARS -> 140 * days;
            case FOUR_STARS -> 155 * days;
            case FIVE_STARS -> 300 * days;
        };
    }
}

enum TripType {
    BUS, TRAIN, FLIGHT
}

class TripBooking {
    Random random = new Random();

    public double bookTrip(TripType tripType, String from, String to) {
        //send data for know information distance
        int distance = random.nextInt(4900) + 100;

        return switch (tripType) {
            case BUS -> 0.5 * distance;
            case TRAIN -> 1.5 * distance;
            case FLIGHT -> 4.5 * distance;
        };
    }
}


enum GuideType {
    NONE, AUDI, PERSON
}

class GuidBooking {
    public double bookGide(GuideType guideType, int days) {
        return switch (guideType) {
            case NONE -> 0;
            case AUDI -> 20 * days;
            case PERSON -> 150 * days;
        };
    }
}


//Facade
class TravelAgency {
    public String buildTrip(String from, String to, String when, int days,
                            HotelType hotelType, TripType tripType, GuideType guideType) {
        StringBuilder stringBuilder = new StringBuilder(1000);

        double price = 0;

        stringBuilder.append("Welcome Booking\n-------------------------------------------------------------------------\n");
        stringBuilder.append("From             : " + from);
        stringBuilder.append("\nTo               : " + from);

        LocalDate start = LocalDate.parse(when);
        LocalDate end = start.plusDays(days);

        stringBuilder.append("\nStart            : " + start + " (" + days + " days) ");
        stringBuilder.append("\nEnd              : " + end);


        HotelBooking hotelBooking = new HotelBooking();
        double fromHotel = hotelBooking.bookHotel(hotelType, days);
        stringBuilder.append("\n-------------------------------------------------------------------------\n");
        stringBuilder.append("\nFrom Hotel (" + hotelType + ")       : " + fromHotel + "0 $ \n");


        TripBooking tripBooking = new TripBooking();
        double fromTrip = tripBooking.bookTrip(tripType, from, to);
        stringBuilder.append("-------------------------------------------------------------------------\n");
        stringBuilder.append("From Trip (" + tripType + ")        : " + fromTrip + "0 $ \n");


        GuidBooking guidBooking = new GuidBooking();
        double fromGuid = guidBooking.bookGide(guideType, days);
        stringBuilder.append("-------------------------------------------------------------------------\n");
        stringBuilder.append("From Guid (" + guideType + ")        : " + fromGuid + "0 $ \n");
        stringBuilder.append("-------------------------------------------------------------------------\n");
        price = fromTrip + fromGuid + fromHotel;
        stringBuilder.append("Total sum : " + price + "0 $ \n");
        stringBuilder.append("-------------------------------------------------------------------------\n");

        return stringBuilder.toString();
    }
}

public class Main {
    public static void main(String[] args) {

        TravelAgency travelAgency = new TravelAgency();
        String ticket = travelAgency.buildTrip("Baku", "Moscow", "2025-06-16", 14, HotelType.THREE_STARS, TripType.TRAIN, GuideType.AUDI);
        System.out.println(ticket);

//        System.out.println(new TravelAgency().buildTrip(
//                "Baku","Moscow","2025-06-16",
//                14,HotelType.THREE_STARS,TripType.TRAIN,GuideType.AUDI));

//        String str = "";
//        StringBuilder stringBuilder = new StringBuilder(10000);
//        for (int i = 0; i < 20; i++) {
//            str+=i;
//            System.out.println(str);
//        }
//
//        System.out.println("\n---------------------\n");
//        for (int i = 0; i < 400; i++) {
//            stringBuilder.append(i);
//            System.out.println( " : (" + stringBuilder.length() + " / " + stringBuilder.capacity() + ")" );
//        }

    }
}