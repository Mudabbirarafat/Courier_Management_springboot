package com.courier.service;

import com.courier.entity.Shipment;
import com.courier.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    @Override
    public Shipment saveShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    @Override
    public Optional<Shipment> getShipmentByTrackingNumber(String trackingNumber) {
        return shipmentRepository.findByTrackingNumber(trackingNumber);
    }

    @Override
    public Optional<Shipment> getShipmentById(Long id) {
        return shipmentRepository.findById(id);
    }

    @Override
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }

    @Override
    public void deleteShipment(Long id) {
        shipmentRepository.deleteById(id);
    }

    @Override
    public Shipment updateShipmentStatus(Long id, String status) {
        Optional<Shipment> optionalShipment = shipmentRepository.findById(id);
        if (optionalShipment.isPresent()) {
            Shipment shipment = optionalShipment.get();
            shipment.setStatus(status);
            return shipmentRepository.save(shipment);
        }
        return null;
    }
}
