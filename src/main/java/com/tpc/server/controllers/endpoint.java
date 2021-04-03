package com.tpc.server.controllers;

import com.tpc.server.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/")
public class endpoint {

    @Autowired
    dayequityRepo dayequityrepo;
    @Autowired
    dayprofitRepo dayprofitrepo;
    @Autowired
    mt4accountsRepo mt4accountsrepo;
    @Autowired
    opentradesRepo opentradesrepo;
    @Autowired
    tradehistoryRepo tradehistoryrepo;

    @GetMapping(value ="/mt4account/{account}")
    public ResponseEntity<Object> getMt4account(@PathVariable String account){
        return new ResponseEntity<>(mt4accountsrepo.findByAccount(account), HttpStatus.OK);
    }

    @GetMapping(value = "/dayprofit/{account}")
    public ResponseEntity<Object> getDayProfit(@PathVariable String account) {
        return new ResponseEntity<>(dayprofitrepo.findAllByAccount(account), HttpStatus.OK);
    }

    @GetMapping(value = "/tradehistory/{account}")
    public  ResponseEntity<Object> getTradeHistory(@PathVariable String account) {
        return new ResponseEntity<>(tradehistoryrepo.findAllByAccount(account), HttpStatus.OK);
    }

}
