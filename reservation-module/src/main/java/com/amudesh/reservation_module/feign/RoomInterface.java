package com.amudesh.reservation_module.feign;

import com.amudesh.reservation_module.dto.Response;
import com.amudesh.reservation_module.dto.RoomRequest;
import com.amudesh.reservation_module.dto.RoomResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("ROOMMANAGEMENT-MODULE")
public interface RoomInterface {

    @PostMapping("/findRoom")
    public ResponseEntity<Response<RoomResponse>> findRoom(@RequestBody RoomRequest roomRequest);

    @PostMapping("/toggleAvailable")
    public ResponseEntity<Response<?>> updateAvailability(@RequestBody RoomRequest roomRequest);

}
