package com.batch.reader.d2f.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.batch.reader.d2f.dto.ComParameter;

public class ComParameterMapper implements RowMapper<ComParameter> {
	public ComParameter mapRow(ResultSet rs, int rowNum) throws SQLException {
		ComParameter comParameter = new ComParameter();
		comParameter.setKeyValue(rs.getString("KEY_VALUE"));
		comParameter.setValValue(rs.getString("VAL_VALUE"));
		comParameter.setUseYn((rs.getString("USE_YN")).charAt(0));
		return comParameter;
	}
}
