package censusanalyser;

import com.opencsv.bean.CsvBindByName;
<<<<<<< HEAD
public class IndianStateCode {

    @CsvBindByName(column = "SrNo",required = true)
    public int srNo;
    @CsvBindByName(column = "StateName",required = true)
    public String stateName;
    @CsvBindByName(column = "TIN",required = true)
    public int TIN;
    @CsvBindByName(column = "StateCode",required = true)
    public String stateCode;

    @Override
    public String toString() {
        return "IndianStateCode{" +
                "srNo=" + srNo +
                ", stateName='" + stateName + '\'' +
                ", TIN=" + TIN +
                ", stateCode='" + stateCode + '\'' +
                '}';
    }
}
=======

public class IndianStateCode {

        @CsvBindByName(column = "SrNo", required = true)
        public int srNo;
        @CsvBindByName(column = "StateName", required = true)
        public String stateName;
        @CsvBindByName(column = "TIN", required = true)
        public int TIN;
        @CsvBindByName(column = "StateCode", required = true)
        public String stateCode;

        @Override
        public String toString() {
            return "IndianStateCode{" +
                    "srNo=" + srNo +
                    ", stateName='" + stateName + '\'' +
                    ", TIN=" + TIN +
                    ", stateCode='" + stateCode + '\'' +
                    '}';
        }
    }


>>>>>>> UC2-IndianStateCodeFile
