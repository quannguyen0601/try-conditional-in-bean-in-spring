###### @ConditionalOnExpression and @ConditionalOnExpression in Spring ######

Author: QuanNguyen

Email:  nquan@outlook.com.vn

``@ConditionalOnExpression("#{'${hotel.code}'.equals('common')}")``


``@ConditionalOnProperty(name=Constant.HOTEL_CODE_ENV, havingValue=Constant.HOTEL_CODE_COMMON, matchIfMissing = true)
``

To set environment variable when running Jar file, we have to add the VM options 
like:


`-D[ENV_NAME]` such as `-Dhotel.code`




