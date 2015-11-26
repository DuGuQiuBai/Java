package cn.itcast.txz.ui;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

//添加游戏说明
//添加标题说明
//游戏结束对话框图标广告
//游戏结束对话框标题广告词
//所有嵌入广告的区域内容

public class MainFrame extends JFrame implements KeyListener {
	private Container panel;
	private JLabel player;
	// 人物所处行
	private int playerX;
	// 人物所处列
	private int playerY;
	// 任务完成计数器
	int count = 0;
	// 任务完成总数
	int total = 3;

	public MainFrame() {
		// 主窗体UI初始化
		this.mainFrameBaseUI();
		// UI数据初始化
		this.dateInit();
		// UI初始化
		this.dateUI();
		// 背景地板UI初始化
		this.backgroundUI();
		// 窗体添加键盘监听
		this.addKeyListener(this);
		this.setVisible(true);
	}

	private JLabel[][] uis = new JLabel[12][16];

	private void dateUI() {
		// 墙初始化
		for (int i = 0; i < dates.length; i++) {
			for (int j = 0; j < dates[i].length; j++) {
				if (dates[i][j] == 1) {
					JLabel temp = new JLabel(new ImageIcon("1.png"));
					temp.setBounds(10 + j * 50, 10 + i * 50, 50, 50);
					this.panel.add(temp);
				}
			}
		}
		// 人物初始位置第3行，第3列(存在第0行第0列)
		this.playerX = 3;
		this.playerY = 3;
		player = new JLabel(new ImageIcon("-10.png"));
		player.setBounds(10 + playerX * 50, 10 + playerY * 50, 50, 50);
		this.panel.add(player);

		// 目标初始化
		// 与total有关
		JLabel tar1 = new JLabel(new ImageIcon("8.png"));
		tar1.setBounds(10 + 14 * 50, 10 + 5 * 50, 50, 50);
		this.panel.add(tar1);
		dates[5][14] = LogicHelper.TARGET;
		uis[5][14] = tar1;
		JLabel tar2 = new JLabel(new ImageIcon("8.png"));
		tar2.setBounds(10 + 14 * 50, 10 + 6 * 50, 50, 50);
		this.panel.add(tar2);
		dates[6][14] = LogicHelper.TARGET;
		uis[6][14] = tar2;
		JLabel tar3 = new JLabel(new ImageIcon("8.png"));
		tar3.setBounds(10 + 14 * 50, 10 + 7 * 50, 50, 50);
		this.panel.add(tar3);
		dates[7][14] = LogicHelper.TARGET;
		uis[7][14] = tar3;

		// 箱子初始化
		// 与total有关
		JLabel box1 = new JLabel(new ImageIcon("4.png"));
		box1.setBounds(10 + 7 * 50, 10 + 3 * 50, 50, 50);
		this.panel.add(box1);
		dates[3][7] = LogicHelper.BOX;
		uis[3][7] = box1;
		JLabel box2 = new JLabel(new ImageIcon("4.png"));
		box2.setBounds(10 + 7 * 50, 10 + 5 * 50, 50, 50);
		this.panel.add(box2);
		dates[5][7] = LogicHelper.BOX;
		uis[5][7] = box2;
		JLabel box3 = new JLabel(new ImageIcon("4.png"));
		box3.setBounds(10 + 7 * 50, 10 + 7 * 50, 50, 50);
		this.panel.add(box3);
		dates[7][7] = LogicHelper.BOX;
		uis[7][7] = box3;

	}

	private int[][] dates = new int[12][16];

	private void dateInit() {
		dates = new int[][] {
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1 },
				{ 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
				{ 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
				{ 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1 },
				{ 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
				{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
				{ 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1 },
				{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, };
	}

	private void backgroundUI() {
		// 背景图片信息设置
		JLabel floor = new JLabel(new ImageIcon("floor.png"));
		floor.setBounds(10, 10, 800, 600);
		this.panel.add(floor);
	}

	private void mainFrameBaseUI() {
		this.panel = this.getContentPane();
		this.setSize(826, 650);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.panel.setLayout(null);
		// 设置窗体标题栏,强化传智播客品牌意识,同时每次上课结束都要对版本号v1.0进行递增变化
		this.setTitle("推箱子v1.0 - java.itcast.cn  传智播客Java培训学院，全国最好的Java培训，国内最顶尖的Java培训课程");
		this.setResizable(false);
		this.getContentPane().setLayout(null);
	}

	// 移动控制，基于原始位置进行移动，第2参数表示垂直方向移动，即行移动，第3参数表示水平方向移动，即列移动
	private static void move(JLabel c, int vMoveType, int hMoveType) {
		c.setLocation(c.getX() - hMoveType * 50, c.getY() - vMoveType * 50);
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		int x = keyCode % 2 == 0 ? 39 - keyCode : 0;
		int y = keyCode % 2 == 1 ? 38 - keyCode : 0;

		// 碰墙
		if (keyCode >= 37 && keyCode <= 40) {
			// 人物图片切换
			// 上10
			// 下-10
			// 左01
			// 右0-1
			player.setIcon(new ImageIcon(x + "" + y + ".png"));
			// 碰地板检测,碰目标检测
			if (dates[playerX - x][playerY - y] == LogicHelper.FLOOR
					|| dates[playerX - x][playerY - y] == LogicHelper.TARGET) {
				move(player, x, y);
				playerX = playerX - x;
				playerY = playerY - y;
				return;
			}
			// 碰箱子检测
			if (dates[playerX - x][playerY - y] == LogicHelper.BOX
					|| dates[playerX - x][playerY - y] == LogicHelper.BOX_AND_TARGET) {
				// 同方向是否为空地板或目标位置
				// 获取前方移动障碍物码
				int code1 = dates[playerX - x][playerY - y];
				int code2 = dates[playerX - x * 2][playerY - y * 2];
				if (code2 == LogicHelper.FLOOR || code2 == LogicHelper.TARGET) {
					// 箱子移动
					JLabel box = uis[playerX - x][playerY - y];
					move(box, x, y);
					// uis模型更新
					uis[playerX - x * 2][playerY - y * 2] = uis[playerX - x][playerY
							- y];
					uis[playerX - x][playerY - y] = null;

					// dates模型更新
					// 从箱子到空地
					if (code1 == LogicHelper.BOX && code2 == LogicHelper.FLOOR) {
						dates[playerX - x * 2][playerY - y * 2] = LogicHelper.BOX;
						dates[playerX - x][playerY - y] = LogicHelper.FLOOR;
					}
					// 从箱子到目标
					if (code1 == LogicHelper.BOX && code2 == LogicHelper.TARGET) {
						dates[playerX - x * 2][playerY - y * 2] = LogicHelper.BOX_AND_TARGET;
						dates[playerX - x][playerY - y] = LogicHelper.FLOOR;
						// 改变箱子模型
						box.setIcon(new ImageIcon("40.png"));
						count++;
					}
					// 从箱子目标到空地
					if (code1 == LogicHelper.BOX_AND_TARGET
							&& code2 == LogicHelper.FLOOR) {
						dates[playerX - x * 2][playerY - y * 2] = LogicHelper.BOX;
						dates[playerX - x][playerY - y] = LogicHelper.TARGET;
						// 改变箱子模型
						box.setIcon(new ImageIcon("4.png"));
						count--;
					}
					// 从箱子目标到目标
					if (code1 == LogicHelper.BOX_AND_TARGET
							&& code2 == LogicHelper.TARGET) {
						dates[playerX - x * 2][playerY - y * 2] = LogicHelper.BOX_AND_TARGET;
						dates[playerX - x][playerY - y] = LogicHelper.TARGET;
						// 改变箱子模型
						box.setIcon(new ImageIcon("40.png"));
					}

					// 人物模型移动
					move(player, x, y);
					// 人物坐标更新
					playerX = playerX - x;
					playerY = playerY - y;

					victory();
				}
				return;
			}
		}
	}

	// 胜利判定
	private void victory() {
		if (count == total) {
			// 移除窗体键盘事件，避免用户多余操作
			this.removeKeyListener(this);
			// 以下代码为广告植入，需要与美工配合后最终定稿
			JDialog victory = new JDialog(this, "恭喜你取得了胜利!传智播客——JAVA培训行业领军旗舰",
					true);
			victory.setSize(400, 300);
			victory.setLocationRelativeTo(null);
			victory.setLayout(null);

			JLabel info = new JLabel(new ImageIcon("gg.jpg"));
			info.setBounds(2, 2, 380, 180);
			victory.add(info);

			JLabel click = new JLabel(new ImageIcon("gg2.jpg"));
			click.setBounds(2, 182, 380, 88);
			click.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					try {
						Runtime.getRuntime()
								.exec("rundll32 url.dll,FileProtocolHandler http://www.itcast.cn");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});
			victory.add(click);
			victory.setVisible(true);
		}
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}
}
