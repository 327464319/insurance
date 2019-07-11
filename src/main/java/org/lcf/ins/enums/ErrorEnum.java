package org.lcf.ins.enums;

public enum ErrorEnum implements BaseErrorEnum {
    success(10000, "�ɹ�"), failure(99999, "ʧ��"), param_error(19998, "��������"), exception(19997, "�쳣"), session_timeout(
                    19995, "�Ự��ʱ"), auth_error(30003, "��֤�����"), vehicle_not_found(40001, "����δ�ҵ�"),

    user_not_login(50001, "�û�δ��¼"), user_not_match(50002, "Ȩ����֤��Ϣ��ƥ��"), pwd_not_match(50003, "�������"),

    operator_is_use(40003,"�����ϼ��������ѹ����˾����ˣ�����ɾ����ͣ��"),

    // ȱ�ٲ����쳣
    PARAMETER_MISSING(40001, "ȱ�ٲ����쳣"),
    // ��ʱ�쳣
    TIME_OUT(40002, "��ʱ�쳣"),

    // POST QUOTE ���ۺ���������
    PREMIUM_FEEDBACK_SCORE_FAIL(20001, "������ƽ̨��ҵ�����"),

    // Ȩ��
    NO_PERMISSION(60001, "û�з���Ȩ��"), TOKEN_EXPIRED(19999, "�������");

    private Integer errorCode;
    private String errorMSG;

    private ErrorEnum(Integer errorCode, String errorMSG) {
        this.errorCode = errorCode;
        this.errorMSG = errorMSG;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMSG() {
        return errorMSG;
    }

    public void setErrorMSG(String errorMSG) {
        this.errorMSG = errorMSG;
    }

    @Override
    public Integer getKey() {
        return errorCode;
    }

    @Override
    public String getValue() {
        return errorMSG;
    }
}

