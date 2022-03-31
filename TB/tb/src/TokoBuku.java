import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class TokoBuku  
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int pilihan,cek,inputCD,Pesanan;
        String nama,PCD;
    
        
        String[] arrPesanan;
        arrPesanan = new String[10];

        String[] cd;
        cd = new String[10];
        
        arrPesanan[0] = "Keajaiban Toko Kelontong Namiya";
        arrPesanan[1] = "Fericuli Fericula";
        arrPesanan[2] = "This Is Why I Need You";
        arrPesanan[3] = "Ayahku (Bukan) Pembohong";
        arrPesanan[4] = "Murder In The Crooked House";

        cd[0] = "CD Music";
        cd[1] = "CD About The Book";
        cd[2] = "CD How its Made";

        Queue<String> name= new LinkedList<>();
        Queue<String> pesan= new LinkedList<>();
        Queue<String> pesanCd= new LinkedList<>();
        
        Stack<String> ag = new Stack<String>();

        ag.push("Autograph Penulis(1)");
        ag.push("Autograph Penulis(2)");
        ag.push("Autograph Penulis(3)");
        ag.push("Autograph Penulis(4)");
        ag.push("Autograph Penulis(5)");
        ag.push("Autograph Penulis(6)");
        
        System.out.println("\n-----------------------------------------------------");
        System.out.println("\tSelamat datang di Toko Buku Namiya");
        System.out.println("\tPre-Order Buku Terbaru Dimulai");
        System.out.println("------------------------------------------------------");
        
        do
        {
            System.out.println("\n\n");
            System.out.println("--------------------------");
            System.out.println("     PEMESANAN BUKU  ");
            System.out.println("--------------------------");
            System.out.println("1. Antrian");
            System.out.println("2. Lihat Antrian ");
            System.out.println("3. Pesan BUKU ");
            System.out.println("4. Pesan CD ");
            System.out.println("5. Pre-Order");
            System.out.println("6. Cek AutoGraph Tersedia");
            System.out.println("7. Cek Pohon Biner Traversal");
            System.out.println("8. Graph");
            System.out.println("9. Keluar");
            System.out.println("--------------------------");
            System.out.print(" inputkan pilihan : ");
            pilihan=input.nextInt();
            System.out.println("\n");

            if(pilihan==1)
            {
                System.out.println("--------------------------");
                Scanner a =new Scanner(System.in);
                System.out.print("Masukan nama      : ");
                nama = a.nextLine();
                name.add(nama);
                if(nama=="")
                {
                    System.out.println("Kosong");
                    
                }
                else
                {
                    System.out.println("Input nama berhasil");
                }
            }
            else if(pilihan==2)
            {
                
                if(name.isEmpty())
                {
                    System.out.println("Antrian kosong");
                }
                else
                {   
                    for(int i=0; i < name.size();i++){
                        System.out.println("--------------------------");
                        System.out.println("        Data " );
                        System.out.println(" Nama         : "+((LinkedList<String>) name).get(i));
                        System.out.println(" Buku         : "+((LinkedList<String>) pesan).get(i));
                        System.out.println(" CD           : "+((LinkedList<String>) pesanCd).get(i));
                        
                    }
                    System.out.println(" Total Antrian Saat ini  : "+name.size());
                }   
            }
            else if(pilihan==3)
            {
                System.out.println("----------------------");
                System.out.println("||**PRE-ORDER BUKU**||");
                System.out.println("----------------------");
                System.out.println(" 1.Keajaiban Toko Kelontong Namiya");
                System.out.println(" 2.Fericuli Fericula");
                System.out.println(" 3.This Is Why I Need You");
                System.out.println(" 4.Ayahku (Bukan) Pembohong");
                System.out.println(" 5.Murder In The Crooked House");
                System.out.println("----------------------");
                Scanner b = new Scanner(System.in);
                Pesanan = b.nextInt();

                    switch (Pesanan)
                    {
                        case 1 :
                            pesan.add(arrPesanan[0]);
                            break;

                        case 2 :
                            pesan.add(arrPesanan[1]);
                            break;

                        case 3 :
                            pesan.add(arrPesanan[2]);
                            break;

                        case 4 :
                            pesan.add(arrPesanan[3]);
                            break;
                        
                        case 5 :
                            pesan.add(arrPesanan[4]);
                            break;
                        
                        default :
                            System.err.println("Pilihan tidak ada");
                    }
                   
            }
            else if(pilihan==4)
            {
                System.out.println("--------------------------");
                System.out.println("\t  Pre-Order CD ");
                System.out.println("1. "+cd[0]);
                System.out.println("2. "+cd[1]);
                System.out.println("3. "+cd[2]);
                System.out.println("--------------------------");

                Scanner c = new Scanner(System.in);
                System.out.print("Inputkan pilihan : ");
                inputCD = c.nextInt();
                if(inputCD==1)
                {
                    pesanCd.add(cd[0]);
                }
                else if(inputCD==2)
                {
                    pesanCd.add(cd[1]);
                }
                else if(inputCD==3)
                {
                    pesanCd.add(cd[2]);
                }
                else
                {
                    System.out.println("Tidak ada");
                }

                ag.pop();
                System.out.println("Data input ");

            }
            else if(pilihan==5)
            {
                if(name.isEmpty())
                {
                    System.out.println("Tidak ada Antrian");
                }
                else
                {
                    System.out.println("Pemesan dengan nama : "+name.poll()+" Telah disetujui");
                    System.out.println("Keluar Antrian");
                    pesan.poll();
                    pesanCd.poll();
                }  
            }
            else if(pilihan==6)
            {
                System.out.println("1.Lihat Jumlah AutoGraph ");
                System.out.println("2.Tambah Tumpukan AutoGraph ");
                System.out.println("3.Ambil AutoGraph Tumpukan Teratas");
                System.out.println("----------------------");
                Scanner d = new Scanner(System.in);
                Scanner e = new Scanner(System.in);
                System.out.print("Inputkan pilihan : ");
                cek = d.nextInt();
                if(cek==1)
                {
                    System.out.println(""+ag);
                }
                else if(cek==2)
                {
                    System.out.print("Tumpukkan AutoGraph  (AutoGraph-?) : ");
                    PCD = e.nextLine();
                    ag.push(PCD);
                    if(ag.isEmpty())
                    {   
                        System.out.println("Kosong");
                    }
                    else
                    {
                        System.out.println("Data terimput");
                    }
                }
                else if(cek==3)
                {
                    System.out.print("Ambil AutoGraph Terbaru");
                    ag.pop();
                    if(ag.isEmpty())
                    {   
                        System.out.println("Kosong");
                    }
                    else
                    {
                        System.out.println("Berhasil");
                }
            }

            
            }
            else if(pilihan==7)
            {
                BinaryTree tree = new BinaryTree();
                System.out.println("Pilih Jenis order benar untuk diskon%\n");
                System.out.println("\t       Snowman\n\t      /     \\\n\t    Want     A\n\t    / \\     / \\ \n\t  Do  You  To  Build\n\t");
                System.out.print("1.Pre-Order    ");
                System.out.print("\n2.In-Order   ");
                System.out.println("\n3.Post-Order ");
                System.out.print("\nPilihan = ");
                Scanner p = new Scanner(System.in);
                int pl = p.nextInt();
                tree.root = new Node("Snowman");
                tree.root.left = new Node("Want");
                tree.root.right = new Node("A");
                tree.root.left.left = new Node("Do");
                tree.root.left.right = new Node("You");
                tree.root.right.left = new Node("To");
                tree.root.right.right = new Node("Build");
                System.out.println(" ");
                System.out.println("  Susunan Lirik ");
                System.out.println("--------------------------");
                System.out.print("Pre-Order  : ");
                tree.printPreorder();
                System.out.print("\nIn-Order   : ");
                tree.printInorder();
                System.out.print("\nPost-Order : ");
                tree.printPostorder();
                
                
            }
            else if(pilihan==8)
            {
                class Graph
                {   
                    //inisialisasi
                    ArrayList<ArrayList<Integer>>gr;
                    int a;
                    
                    //buat vertex
                    void addEdge(int v,int u)
                    {
                        gr.get(v).add(u);
                        gr.get(u).add(v);
                    }


                    Graph(int nodes)
                    {
                        a = nodes;
                        gr = new ArrayList<ArrayList<Integer>>();
                        for(int i=0;i<a;i++)
                        {
                            gr.add(new ArrayList<Integer>());
                        }
                    }

                    //menampilkan graph
                    void printGraph()
                    {
                        for(int i=0;i<a;i++)
                        {
                            System.out.print("Node : "+i);
                            for(int x : gr.get(i))System.out.print(" -> "+x);
                            System.out.println();
                        }
                    }
                }
                    
                    Graph arah = new Graph(11);
            
                    arah.addEdge(0, 1);
                    arah.addEdge(1, 2);
                    arah.addEdge(2, 3);
                    arah.addEdge(3, 4);
                    arah.addEdge(5, 6);
                    arah.addEdge(6, 7);
                    arah.addEdge(7, 8);
                    arah.addEdge(8, 9);
                    arah.addEdge(9, 10);
                    arah.printGraph();
            }
            else
            {
                if(pilihan==9)
                {
                    System.out.println("Program Terminate");
                }
            }
        }
        while(pilihan!=9);
        input.close();
    }
}
