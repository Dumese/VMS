package com.example.vms.util;

import com.example.vms.data.dto.OrderDTO;
import com.example.vms.data.dto.OrderDetailDTO;
import com.example.vms.data.vo.OrderDetailVO;
import com.example.vms.data.vo.OrderVO;
import lombok.Data;

import java.util.List;

@Data
public class OrderResult {

    private OrderVO order;

    private List<OrderDetailVO> orderDetailVOList;
}
