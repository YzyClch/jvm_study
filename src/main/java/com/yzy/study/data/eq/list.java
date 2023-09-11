//package com.yzy.study.data.eq;
//import com.alibaba.fastjson.JSONArray;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//public class list {
//
//
////    public static void main(String[] args) {
////
////        String s = "[{\"builderBusinessId\":\"8697\",\"builderBusinessType\":\"task\",\"builderContactsPhone\":\"15958832456\",\"builderUserId\":\"26af57c1a4a7465cbd976be23017191e\",\"builderUserName\":\"\",\"contractorBusinessType\":\"pro\",\"contractorContactsPhone\":\"15958832456\",\"contractorCorpSuiteId\":\"ding9bd1bfb599ae868935c2f4657eb6378f\",\"contractorPartnerId\":\"153534\",\"contractorUserName\":\"\",\"dataType\":\"c\",\"id\":10672,\"orderScopeType\":\"w\",\"projectId\":\"51fce291b32a4c6daa08809d6d7fe4b9\",\"projectName\":\"\"},{\"builderBusinessId\":\"8697\",\"builderBusinessType\":\"task\",\"builderContactsPhone\":\"15958832456\",\"builderUserId\":\"26af57c1a4a7465cbd976be23017191e\",\"builderUserName\":\"\",\"contractorBusinessType\":\"pro\",\"contractorContactsPhone\":\"15958832456\",\"contractorCorpSuiteId\":\"ding9bd1bfb599ae868935c2f4657eb6378f\",\"contractorPartnerId\":\"153534\",\"contractorUserName\":\"\",\"dataType\":\"b\",\"id\":10672,\"orderScopeType\":\"w\",\"projectName\":\"\"}]\n";
////
////        List<BusinessOrderDetailDTO> list = JSONArray.parseArray(s, BusinessOrderDetailDTO.class);
////
////        Optional<BusinessOrderDetailDTO> cp = list.stream().filter(i -> i.getContractorPartnerId() != null).findFirst();
////        if (cp.isPresent()){
////            BusinessOrderDetailDTO c = cp.get();
////            System.out.println(c.getContractorUserId());
////            System.out.println(c.getContractorCorpSuiteId());
////            System.out.println(c.getContractorContactsPhone());
////            System.out.println(c.getContractorPartnerId());
////        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//}
