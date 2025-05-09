package com.courier.service;

import com.courier.entity.Shipment;

import java.util.List;
import java.util.Optional;

public interface ShipmentService {
    Shipment saveShipment(Shipment shipment);
    Optional<Shipment> getShipmentByTrackingNumber(String trackingNumber);
    Optional<Shipment> getShipmentById(Long id);
    List<Shipment> getAllShipments();
    void deleteShipment(Long id);
    Shipment updateShipmentStatus(Long id, String status);
}
