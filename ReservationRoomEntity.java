package sut.se.g16.Entity;

import lombok.*;
import java.util.*;
import javax.persistence.*;
import java.time.LocalDate;
//import sut.se.g16.Entity.*;

@Entity
@Data @Getter @Setter
@ToString @NoArgsConstructor
@EqualsAndHashCode
public class ReservationRoomEntity {
    @Id
    @SequenceGenerator(name="resevationRoomId_seq",sequenceName="resevationRoomId_seq")               
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="resevationRoomId_seq")  
    private @NonNull Long reservationRoomId;

    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name= "hotelId")
    private HotelEntity newHotelEntity;

    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name= "customerId")
    private CustomerEntity newCustomerEntity;

    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name= "promotionId")
    private PromotionEntity newPromotionEntity;

    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name= "roomTypeId")
    private RoomTypeEntity newRoomTypeEntity;

    private @NonNull Date dateIn;
    private @NonNull Date dateOut;
    private @NonNull Double totalPriceReservationRoom;

    public Long getReservationRoomId() {
        return reservationRoomId;
    }

    public void setReservationRoomId(Long reservationRoomId) {
        this.reservationRoomId = reservationRoomId;
    }

    public HotelEntity getNewHotelEntity() {
        return newHotelEntity;
    }

    public void setNewHotelEntity(HotelEntity newHotelEntity) {
        this.newHotelEntity = newHotelEntity;
    }

    public CustomerEntity getNewCustomerEntity() {
        return newCustomerEntity;
    }

    public void setNewCustomerEntity(CustomerEntity newCustomerEntity) {
        this.newCustomerEntity = newCustomerEntity;
    }

    public PromotionEntity getNewPromotionEntity() {
        return newPromotionEntity;
    }

    public void setNewPromotionEntity(PromotionEntity newPromotionEntity) {
        this.newPromotionEntity = newPromotionEntity;
    }

    public RoomTypeEntity getNewRoomTypeEntity() {
        return newRoomTypeEntity;
    }

    public void setNewRoomTypeEntity(RoomTypeEntity newRoomTypeEntity) {
        this.newRoomTypeEntity = newRoomTypeEntity;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Double getTotalPriceReservationRoom() {
        return totalPriceReservationRoom;
    }

    public void setTotalPriceReservationRoom(Double totalPriceReservationRoom) {
        this.totalPriceReservationRoom = totalPriceReservationRoom;
    }
}