import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BrickBreakerGame extends JFrame {

    private JPanel gamePanel;
    private Timer timer;
    private int ballX;
    private int ballY;
    private int ballXDirection;
    private int ballYDirection;
    private int paddleX;
    private static final int PADDLE_Y = 540;
    private static final int BALL_SIZE = 20;
    private static final int PADDLE_WIDTH = 150;
    private static final int PADDLE_HEIGHT = 20;
    private static final int BRICK_WIDTH = 50;
    private static final int BRICK_HEIGHT = 20;
    private static final int NUM_BRICKS = 30;
    private static final int NUM_ROWS = 3;
    private static final int NUM_COLS = 10;
    private boolean isGameOver;

    private BrickBreakerGame() {
        setTitle("Brick Breaker");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                draw(g);
            }
        };
        add(gamePanel);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyPress(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                handleKeyRelease(e);
            }
        });
        setFocusable(true);
        requestFocus();

        initializeGame();

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
            }
        });
        timer.start();
    }

    private void initializeGame() {
        ballX = 400;
        ballY = 500;
        ballXDirection = 1;
        ballYDirection = -1;
        paddleX = 350;
        isGameOver = false;
    }

    private void draw(Graphics g) {
        if (isGameOver) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.PLAIN, 48));
            g.drawString("Game Over", 300, 300);
            return;
        }

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.WHITE);
        g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
        g.fillRect(paddleX, PADDLE_Y, PADDLE_WIDTH, PADDLE_HEIGHT);

        int brickX = 0;
        int brickY = 0;
        for (int i = 0; i < NUM_BRICKS; i++) {
            if (i % NUM_COLS == 0 && i != 0) {
                brickX = 0;
                brickY += BRICK_HEIGHT;
            }
            g.setColor(Color.RED);
            g.fillRect(brickX, brickY, BRICK_WIDTH, BRICK_HEIGHT);
            brickX += BRICK_WIDTH;
        }
    }

    private void update() {
        if (isGameOver) {
            return;
        }

        ballX += ballXDirection;
        ballY += ballYDirection;

        if (ballX <= 0 || ballX >= getWidth() - BALL_SIZE) {
            ballXDirection *= -1;
        }

        if (ballY <= 0) {
            ballYDirection *= -1;
        }

        if (ballY >= getHeight() - BALL_SIZE) {
            isGameOver = true;
        }

        if (ballY + BALL_SIZE
        		== PADDLE_Y && ballX + BALL_SIZE >= paddleX && ballX <= paddleX + PADDLE_WIDTH) {
        	ballYDirection *= -1;
        }
        	    gamePanel.repaint();
    }

    private void handleKeyPress(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            if (paddleX > 0) {
                paddleX -= 20;
            }
        } else if (key == KeyEvent.VK_RIGHT) {
            if (paddleX < getWidth() - PADDLE_WIDTH) {
                paddleX += 20;
            }
        }
    }

    private void handleKeyRelease(KeyEvent e) {
        // No key release handling needed for this game
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                BrickBreakerGame game = new BrickBreakerGame();
                game.setVisible(true);
            }
        });
    }
}