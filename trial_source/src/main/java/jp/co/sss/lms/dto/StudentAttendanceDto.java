package jp.co.sss.lms.dto;

import java.util.Date;

import lombok.Data;

/**
 * 勤怠情報DTO
 * 
 * @author 東京ITスクール
 */
@Data
public class StudentAttendanceDto {

	/** 受講生入力勤怠情報ID */
	private Integer studentAttendanceId;
	/** LMSユーザID */
	private String lmsUserId;
	/** 日付 */
	private Date trainingDate;
	/** 出勤時間 */
	private String trainingStartTime;
	/** 退勤時間 */
	private String trainingEndTime;
	/** 勤怠状況 */
	private Short status;
	/** 備考 */
	private String note;
	/** 中抜け時間 */
	private Integer blankTime;
	/** 勤怠状態画面表示名 */
	private String statusDispName;
	/** 出勤時間の時間部分 */
	private String trainingStartHour;
	/** 出勤時間の分部分 */
	private String trainingStartMinute;
	/** 退勤時間の時間部分 */
	private String trainingEndHour;
	/** 退勤時間の分部分 */
	private String trainingEndMinute;
}
