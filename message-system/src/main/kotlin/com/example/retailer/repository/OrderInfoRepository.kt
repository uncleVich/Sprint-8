package com.example.retailer.repository

import com.example.retailer.api.distributor.OrderInfo
import org.springframework.data.jpa.repository.JpaRepository

interface OrderInfoRepository: JpaRepository<OrderInfo, String>