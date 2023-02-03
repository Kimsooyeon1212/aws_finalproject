package board.spring.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BoardDAO {
	//게시물리스트
	public int getTotalBoard();
	public List<BoardDTO> getBoardList(int limit);
	//상세게시물 조회
	public BoardDTO getOneBoard(int seq);
	public void updateViewCount(int seq);
	public void insertBoard(BoardDTO dto);
}
