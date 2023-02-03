package board.spring.mybatis;

import java.util.List;

public interface BoardService {
	//게시물리스트를 보여주기 위해 필요한 서비스들 
	public int getTotalBoard();
	public List<BoardDTO> getBoardList(int limit);
	
	//게시글상세페이지
	public BoardDTO getOneBoard(int seq);
	//public void updateViewCount(int seq);
	public void insertBoard(BoardDTO dto);
}
